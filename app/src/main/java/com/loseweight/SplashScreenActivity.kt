package com.loseweight

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import com.loseweight.utils.Constant
import com.loseweight.utils.Utils
import com.utillity.db.DataHelper


class SplashScreenActivity : BaseActivity() {

    internal var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        DataHelper(this).checkDBExist()

//        const firestore = firebase.firestore();
//        const settings = {/* your settings... */ timestampsInSnapshots: true};
//        firestore.settings(settings);
//        init()
    }


    fun showAlertDialog() {
        val builder = AlertDialog.Builder(getActivity(), R.style.MyAlertDialogStyle)
        builder.setTitle("Important")
            .setMessage(getActivity().resources.getString(R.string.permission_msg))
            .setPositiveButton(android.R.string.ok) { dialog, which -> dialog.dismiss() }
            .setNegativeButton(getActivity().resources.getString(R.string.permission_setting)) { dialog, which ->
                dialog.dismiss()
                finish()
                val intent = Intent()
                intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                val uri = Uri.fromParts("package", packageName, null)
                intent.data = uri
                startActivity(intent)
            }.show()

    }

    fun startapp(sleepTime: Long) {
        handler.postDelayed(startApp, sleepTime)
    }

    internal var startApp: Runnable = object : Runnable {
        override fun run() {
            handler.removeCallbacks(this)

            if (Utils.getPref(
                    this@SplashScreenActivity,
                    Constant.PREF_IS_FIRST_TIME,
                    true
                ) && Utils.getPref(this@SplashScreenActivity, Constant.PREF_GOAL, "")
                    .isNullOrEmpty()
            ) {
                val i = Intent(getActivity(), ChooseYourPlanActivity::class.java)
                i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(i)
                finish()
            } else {
                val i = Intent(getActivity(), HomeActivity::class.java)

                if(intent.extras != null){
                    if(intent.extras!!.containsKey("isFrom") && intent.extras!!.get("isFrom") == Constant.FROM_DRINK_NOTIFICATION)
                    {
                       i.putExtra("isFrom",Constant.FROM_DRINK_NOTIFICATION)
                    }
                }
                i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(i)
                finish()
            }

            /*val i = Intent(getActivity(), ChooseYourPlanActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
            finish()*/
        }
    }


}
