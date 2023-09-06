package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnFadeIn: Button
    lateinit var btnFadeOut: Button
    lateinit var btnCrossFade: Button
    lateinit var btnBlink: Button
    lateinit var btnZoomIn: Button
    lateinit var btnZoomOut: Button
    lateinit var btnRotate: Button
    lateinit var btnMove: Button
    lateinit var btnSlideUp: Button
    lateinit var btnSlideDown: Button
    lateinit var btnBounce: Button
    lateinit var btnSequential: Button
    lateinit var btnTogether: Button
    lateinit var animFadeIn: Animation
    lateinit var animFadeOut: Animation
    lateinit var animBlink: Animation
    lateinit var animZoomIn: Animation
    lateinit var animZoomOut: Animation
    lateinit var animRotate: Animation
    lateinit var animMove: Animation
    lateinit var animSlideUp: Animation
    lateinit var animSlideDown: Animation
    lateinit var animBounce: Animation
    lateinit var animSequential: Animation
    lateinit var animTogether: Animation
    lateinit var animCrossFadeIn: Animation
    lateinit var animCrossFadeOut: Animation
    lateinit var txtFadeIn: TextView
    lateinit var txtFadeOut: TextView
    lateinit var txtBlink: TextView
    lateinit var txtZoomIn: TextView
    lateinit var txtZoomOut: TextView
    lateinit var txtRotate: TextView
    lateinit var txtMove: TextView
    lateinit var txtSlideUp: TextView
    lateinit var txtSlideDown: TextView
    lateinit var txtBounce: TextView
    lateinit var txtSeq: TextView
    lateinit var txtTog: TextView
    lateinit var txtIn: TextView
    lateinit var txtOut: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFadeIn = findViewById<View>(R.id.btnFadeIn) as Button
        btnFadeOut = findViewById<View>(R.id.btnFadeOut) as Button
        btnCrossFade = findViewById<View>(R.id.btnCrossFade) as Button
        btnBlink = findViewById<View>(R.id.btnBlink) as Button
        btnZoomIn = findViewById<View>(R.id.btnZoomIn) as Button
        btnZoomOut = findViewById<View>(R.id.btnZoomOut) as Button
        btnRotate = findViewById<View>(R.id.btnRotate) as Button
        btnMove = findViewById<View>(R.id.btnMove) as Button
        btnSlideUp = findViewById<View>(R.id.btnSlideUp) as Button
        btnSlideDown = findViewById<View>(R.id.btnSlideDown) as Button
        btnBounce = findViewById<View>(R.id.btnBounce) as Button
        btnSequential = findViewById<View>(R.id.btnSequential) as Button
        btnTogether = findViewById<View>(R.id.btnTogether) as Button
        txtFadeIn = findViewById<View>(R.id.txt_fade_in) as TextView
        txtFadeOut = findViewById<View>(R.id.txt_fade_out) as TextView
        txtBlink = findViewById<View>(R.id.txt_blink) as TextView
        txtZoomIn = findViewById<View>(R.id.txt_zoom_in) as TextView
        txtZoomOut = findViewById<View>(R.id.txt_zoom_out) as TextView
        txtRotate = findViewById<View>(R.id.txt_rotate) as TextView
        txtMove = findViewById<View>(R.id.txt_move) as TextView
        txtSlideUp = findViewById<View>(R.id.txt_slide_up) as TextView
        txtSlideDown = findViewById<View>(R.id.txt_slide_down) as TextView
        txtBounce = findViewById<View>(R.id.txt_bounce) as TextView
        txtSeq = findViewById<View>(R.id.txt_seq) as TextView
        txtTog = findViewById<View>(R.id.txt_tog) as TextView
        txtIn = findViewById<View>(R.id.txt_in) as TextView
        txtOut = findViewById<View>(R.id.txt_out) as TextView
        animFadeIn=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )
        btnFadeIn.setOnClickListener {
            txtFadeIn.visibility=View.VISIBLE
            txtFadeIn.startAnimation(animFadeIn)
        }
        animFadeOut=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_out
        )
        btnFadeOut.setOnClickListener {
            txtFadeOut.visibility=View.VISIBLE
            txtFadeOut.startAnimation(animFadeOut)
        }
        animCrossFadeIn=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )
        animCrossFadeOut=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_out
        )
        btnCrossFade.setOnClickListener {
            txtOut.visibility=View.VISIBLE
            txtOut.startAnimation(animCrossFadeIn)
            txtOut.startAnimation(animCrossFadeOut)
        }
        animBlink=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink
        )
        btnBlink.setOnClickListener {
            txtBlink.visibility=View.VISIBLE
            txtBlink.startAnimation(animBlink)
        }
        animZoomIn=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoom_in
        )
        btnZoomIn.setOnClickListener {
            txtZoomIn.visibility=View.VISIBLE
            txtZoomIn.startAnimation(animZoomIn)
        }
        animZoomOut=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoom_out
        )
        btnZoomOut.setOnClickListener {
            txtZoomOut.visibility=View.VISIBLE
            txtZoomOut.startAnimation(animZoomOut)
        }
        animRotate=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.rotate
        )
        btnRotate.setOnClickListener {
            txtRotate.startAnimation(animRotate)
        }
        animMove=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.move
        )
        btnMove.setOnClickListener {
            txtMove.startAnimation(animMove)
        }
        animSlideUp=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_up
        )
        btnSlideUp.setOnClickListener {
            txtSlideUp.startAnimation(animSlideUp)
        }
        animSlideDown=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_down
        )
        btnSlideDown.setOnClickListener {
            txtSlideDown.startAnimation(animSlideDown)
        }
        animBounce=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.bounce
        )
        btnBounce.setOnClickListener {
            txtBounce.startAnimation(animBounce)
        }
        animSequential=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.sequential
        )
        btnSequential.setOnClickListener {
            txtSeq.startAnimation(animSequential)
        }
        animTogether=AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.together
        )
        btnTogether.setOnClickListener {
            txtTog.startAnimation(animTogether)
        }



    }
}