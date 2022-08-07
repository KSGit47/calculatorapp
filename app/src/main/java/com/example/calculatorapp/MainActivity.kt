package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAc.setOnClickListener {
            binding.input.text=""
            binding.output.text=""

        }
        binding.btn0.setOnClickListener {
            binding.input.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.input.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.input.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.input.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.input.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.input.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.input.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.input.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.input.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.input.append("9")
        }
        binding.btnPlus.setOnClickListener {
            binding.input.append("+")
        }
        binding.btnMinus.setOnClickListener {
            binding.input.append("-")
        }
        binding.btnMultiplication.setOnClickListener {
            binding.input.append("*")
        }
        binding.btnDivide.setOnClickListener {
            binding.input.append("/")
        }
        binding.btnEndBracket.setOnClickListener {
            binding.input.append(")")
        }
        binding.btnStartBracket.setOnClickListener {
            binding.input.append("(")
        }
        binding.btnDot.setOnClickListener {
            binding.input.append(".")
        }
        binding.btnBs.setOnClickListener {
            val text = binding.input.text.toString()
            if(text.isNotEmpty()) {
               binding.input.text = binding.input.text.dropLast(1)
            }
            else
            binding.input.text = ""
        }

        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.input.text.toString()).build()
            val result = expression.evaluate()
            val longresult=result.toLong()
            if(result==longresult.toDouble())
            {
                binding.output.text= longresult.toString()
            }
            else {
                binding.output.text = result.toString()
            }
        }
    }
}