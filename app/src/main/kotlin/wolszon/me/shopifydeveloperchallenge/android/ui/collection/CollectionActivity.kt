package wolszon.me.shopifydeveloperchallenge.android.ui.collection

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.MenuItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_collection.*
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.base.BaseActivity
import wolszon.me.shopifydeveloperchallenge.android.utils.isVisible
import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import javax.inject.Inject

class CollectionActivity : BaseActivity(), CollectionView {
    @Inject
    lateinit var presenter: CollectionPresenter
    lateinit var collection: Collection

    companion object {
        private const val EXTRA_COLLECTION = "COLLECTION"

        fun createIntent(context: Context, collection: Collection): Intent {
            return Intent(context, CollectionActivity::class.java).apply {
                putExtra(EXTRA_COLLECTION, collection)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection)

        collection = intent.getParcelableExtra(EXTRA_COLLECTION)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = collection.title

        Picasso.get().load(collection.imageSrc).into(image)
        collectionTitle.text = collection.title
        if (collection.body.isEmpty()) {
            collectionBody.typeface = Typeface.create(collectionBody.typeface, Typeface.ITALIC)
            collectionBody.text = getString(R.string.no_description)
        } else {
            collectionBody.text = collection.body
        }

        presenter.subscribe(this)
        presenter.loadProducts()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        android.R.id.home -> {
            finish()
            true
        }
        else -> false
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }

    private fun hideProductLoader() {
        productsLoader.isVisible = false
        productsLoader.isVisible = true
    }

    override fun showProducts(products: List<Unit>) {
        hideProductLoader()

        // TODO
    }
}