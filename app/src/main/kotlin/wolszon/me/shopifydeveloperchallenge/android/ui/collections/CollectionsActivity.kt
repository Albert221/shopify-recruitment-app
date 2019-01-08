package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_collections.*
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.base.BaseActivity
import wolszon.me.shopifydeveloperchallenge.android.ui.collections.item.CollectionsListAdapter
import wolszon.me.shopifydeveloperchallenge.android.utils.MarginItemDecoration
import wolszon.me.shopifydeveloperchallenge.android.utils.prepare
import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import javax.inject.Inject
import kotlin.math.roundToInt

class CollectionsActivity : BaseActivity(), CollectionsView {
    @Inject
    lateinit var presenter: CollectionsPresenter

    @Inject
    lateinit var collectionsAdapter: CollectionsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)

        collectionsList.apply {
            prepare()
            adapter = collectionsAdapter

            val margin = (16 * context.resources.displayMetrics.density).roundToInt()
            addItemDecoration(MarginItemDecoration(margin))
        }

        presenter.subscribe(this)
        presenter.loadCollections()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }

    override fun showCollections(collections: List<Collection>) {
        collectionsAdapter.showCollections(collections)
    }
}