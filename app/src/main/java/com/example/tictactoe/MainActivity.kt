package com.example.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var flag = 0
    private var count = 0
    private lateinit var r1c1Btn: String
    private lateinit var r1c2Btn: String
    private lateinit var r1c3Btn: String
    private lateinit var r2c1Btn: String
    private lateinit var r2c2Btn: String
    private lateinit var r2c3Btn: String
    private lateinit var r3c1Btn: String
    private lateinit var r3c2Btn: String
    private lateinit var r3c3Btn: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun btnCheck(view: View) {
        val currBtn: Button = view as Button

        if (currBtn.text.toString() == "") {

            count++
            if (flag == 0) {
                currBtn.text = "X"
                flag = 1
            } else {
                currBtn.text = "O"
                flag = 0
            }

            if (count > 4) {

                r1c1Btn = binding.r1c1btn.text.toString()
                r1c2Btn = binding.r1c2btn.text.toString()
                r1c3Btn = binding.r1c3btn.text.toString()
                r2c1Btn = binding.r2c1btn.text.toString()
                r2c2Btn = binding.r2c2btn.text.toString()
                r2c3Btn = binding.r2c3btn.text.toString()
                r3c1Btn = binding.r3c1btn.text.toString()
                r3c2Btn = binding.r3c2btn.text.toString()
                r3c3Btn = binding.r3c3btn.text.toString()

                if (r1c1Btn == r1c2Btn && r1c2Btn == r1c3Btn && r1c1Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c1Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r2c1Btn == r2c2Btn && r2c2Btn == r2c3Btn && r2c1Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r2c1Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r3c1Btn == r3c2Btn && r3c2Btn == r3c3Btn && r3c1Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r3c1Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c1Btn == r2c1Btn && r2c1Btn == r3c1Btn && r1c1Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c1Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c2Btn == r2c2Btn && r2c2Btn == r3c2Btn && r1c2Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c2Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c3Btn == r2c3Btn && r2c3Btn == r3c3Btn && r1c3Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c3Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c1Btn == r2c2Btn && r2c2Btn == r3c3Btn && r1c1Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c1Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c3Btn == r2c2Btn && r2c2Btn == r3c1Btn && r1c3Btn != "") {
                    Toast.makeText(this@MainActivity, "Winner is: $r1c3Btn", Toast.LENGTH_SHORT)
                        .show()
                    resetGame()
                } else if (r1c1Btn != "" && r1c2Btn != "" && r1c3Btn != "" && r2c1Btn != "" && r2c2Btn != "" && r2c3Btn != "" && r3c1Btn != "" && r3c2Btn != "" && r3c3Btn != "") {
                    Toast.makeText(this@MainActivity, "Match is drawn ", Toast.LENGTH_SHORT).show()
                    resetGame()
                }
            }
        }
    }

    private fun resetGame() {
        binding.r1c1btn.text = ""
        binding.r1c2btn.text = ""
        binding.r1c3btn.text = ""
        binding.r2c1btn.text = ""
        binding.r2c2btn.text = ""
        binding.r2c3btn.text = ""
        binding.r3c1btn.text = ""
        binding.r3c2btn.text = ""
        binding.r3c3btn.text = ""
        flag = 0
        count = 0
    }
}