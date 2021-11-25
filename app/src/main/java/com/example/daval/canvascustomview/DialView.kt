package com.example.daval.canvascustomview

import android.content.Context
import android.graphics.Paint
import android.graphics.Point
import android.graphics.PointF
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View


private enum class FanSpeed(val label: Int) {
    OFF(R.string.fan_off),
    LOW(R.string.fan_low),
    MEDIUM(R.string.fan_medium),
    HIGH(R.string.fan_high);
}

private const val RADIUS_OFFSET_LABEL = 30
private const val RADIUS_OFFSET_INDICATOR = -35
/**
 * the @JvmOverload annotations instructs to kotlin compiler to generate
 * overloads for this function that substitute default parameter values
 *
 * */
class DialView  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet ? = null,
    defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr){

    private var radius = 0.0f    // radius of the circle
    private var fanSpeed = FanSpeed.OFF   // the active selection
    // position variable which will be used to draw label and indicator circle position
    private val pointPosition: PointF = PointF(0.0f, 0.0f)

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style =  Paint.Style.FILL
        textAlign = Paint.Align.CENTER
        textSize = 55.0f
        typeface = Typeface.create("" , Typeface.BOLD)
    }
}