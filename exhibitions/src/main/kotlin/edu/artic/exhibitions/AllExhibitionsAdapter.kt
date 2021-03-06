package edu.artic.exhibitions

import android.view.View
import com.bumptech.glide.Glide
import com.fuzz.rx.bindToMain
import com.fuzz.rx.disposedBy
import com.jakewharton.rxbinding2.view.clicks
import com.jakewharton.rxbinding2.widget.text
import edu.artic.adapter.AutoHolderRecyclerViewAdapter
import edu.artic.adapter.BaseViewHolder
import kotlinx.android.synthetic.main.cell_all_exhibitions_layout.view.*

/**
 * @author Sameer Dhakal (Fuzz)
 */

class AllExhibitionsAdapter : AutoHolderRecyclerViewAdapter<AllExhibitionsCellViewModel>() {

    override fun View.onBindView(item: AllExhibitionsCellViewModel, position: Int) {
        item.exhibitionImageUrl.subscribe {
            Glide.with(context)
                    .load(it)
                    .into(image)
        }.disposedBy(item.viewDisposeBag)

        item.exhibitionTitle.bindToMain(title.text()).disposedBy(item.viewDisposeBag)
        item.exhibitionTitle.subscribe{image.transitionName = it}.disposedBy(item.viewDisposeBag)
        item.exhibitionDescription
                .bindToMain(description.text())
                .disposedBy(item.viewDisposeBag)
    }
    override fun onItemViewDetachedFromWindow(holder: BaseViewHolder, position: Int) {
        super.onItemViewDetachedFromWindow(holder, position)
        getItem(position).apply {
            cleanup()
            onCleared()
        }
    }

    override fun getLayoutResId(position: Int): Int {
        return R.layout.cell_all_exhibitions_layout
    }

}