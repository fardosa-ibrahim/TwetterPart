package com.example.twiterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twiterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var tweets=Tweets("aisha","fardosairahim@gmail.com","6h","Hello world")
        var tweets2=Tweets("aisha","fardosairahim@gmail.com","8","Hello Wold")
        var tweets3=Tweets("aisha","fardosairahim@gmail.com","15","Hello world")
        var tweets4=Tweets("aisha","fardosairahim@gmail.com","21","Hello wold")
        var tweets5=Tweets("aisha","fardosairahim@gmail.com","4","Hello world")

        var contactList= listOf(tweets,tweets2,tweets3,tweets4,tweets5)
        var tweetsAdaptor=TwetterAdaptor(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=tweetsAdaptor




    }
}