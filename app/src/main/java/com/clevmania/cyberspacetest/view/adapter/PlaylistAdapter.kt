package com.clevmania.cyberspacetest.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.clevmania.cyberspacetest.R
import com.clevmania.cyberspacetest.model.PlaylistModel
import kotlinx.android.synthetic.main.item_playlist.view.*

class PlaylistAdapter(private val playlist: List<PlaylistModel>):
    RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate( R.layout.item_playlist,parent, false)
        return PlaylistViewHolder(view)
    }

    override fun getItemCount() = playlist.size

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bindView(playlist[position])
    }

    class PlaylistViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        fun bindView(playlistModel: PlaylistModel) {
            when(adapterPosition){
                1 -> {
                    itemView.tv_playlist_title.setTextColor(ContextCompat.
                        getColor(itemView.context,R.color.colorBlue))
                }
            }
            itemView.tv_playlist_title.text = playlistModel.title
            itemView.tv_playlist_artist.text = playlistModel.artist
            itemView.tv_playlist_no.text = (adapterPosition + 1).toString()
        }
    }
}