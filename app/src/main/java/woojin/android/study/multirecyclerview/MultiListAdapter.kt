package woojin.android.study.multirecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woojin.android.study.multirecyclerview.databinding.ItemAListBinding
import woojin.android.study.multirecyclerview.databinding.ItemBListBinding
import woojin.android.study.multirecyclerview.databinding.ItemCListBinding

class MultiListAdapter(private val dataList: List<ListData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ViewHolderA(private val binding: ItemAListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(type: Int) {
            binding.titleTextView.text = type.toString()
        }
    }

    inner class ViewHolderB(private val binding: ItemBListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(type: Int) {
            binding.titleTextView.text = type.toString()
        }
    }

    inner class ViewHolderC(private val binding: ItemCListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(type: Int) {
            binding.titleTextView.text = type.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> {
                ViewHolderA(
                    ItemAListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            2 -> {
                ViewHolderB(
                    ItemBListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            3 -> {
                ViewHolderC(
                    ItemCListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> {
                ViewHolderA(
                    ItemAListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            1 -> {
                (holder as ViewHolderA).bind(dataList[position].type)
            }
            2 -> {
                (holder as ViewHolderB).bind(dataList[position].type)
            }
            3 -> {
                (holder as ViewHolderC).bind(dataList[position].type)
            }
        }
    }

    override fun getItemCount(): Int = dataList.size

    override fun getItemViewType(position: Int): Int {
        return dataList[position].type
    }
}