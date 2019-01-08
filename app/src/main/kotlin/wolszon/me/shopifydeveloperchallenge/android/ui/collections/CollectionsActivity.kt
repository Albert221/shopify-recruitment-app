package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import android.os.Bundle
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.base.BaseActivity
import javax.inject.Inject

class CollectionsActivity : BaseActivity(), CollectionsView {
    @Inject
    lateinit var presenter: CollectionsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)

        presenter.subscribe(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }
}