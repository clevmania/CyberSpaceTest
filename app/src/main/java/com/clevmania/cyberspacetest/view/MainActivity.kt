package com.clevmania.cyberspacetest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.clevmania.cyberspacetest.R
import com.clevmania.cyberspacetest.model.PlaylistModel
import com.clevmania.cyberspacetest.view.adapter.PlaylistAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        populatePlayList()
    }

    private fun populatePlayList(){
        rv_playlist.setHasFixedSize(true)
        val playlist = arrayListOf<PlaylistModel>()
        playlist.add(PlaylistModel(getString(R.string.music_title), getString(R.string.music_artist), "03:23"))
        playlist.add(PlaylistModel("No Problem (feat. Lil Wayne and 2 Chainz",
            "Chance the Rapper &#183; 01:21", "03:23"))
        playlist.add(PlaylistModel("Summer Friends (feat. Jeremih and Francis and the Lights)",
            "Chance the Rapper &#183; 04:50", "03:23"))
        playlist.add(PlaylistModel("D.R.A.M Sings Special",
            "Chance the Rapper &#183; 01:50", "03:23"))
        playlist.add(PlaylistModel("One Step At A To,e",
            "Jordin Sparks &#183; 04:27", "03:23"))
        playlist.add(PlaylistModel("SIA",
            "Chandelier &#183; 03:45", "03:23"))

        rv_playlist.layoutManager = LinearLayoutManager(this)
        rv_playlist.adapter = PlaylistAdapter(playlist)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }
}
