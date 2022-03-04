package com.loseweight.utils

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.facebook.ads.Ad
import com.facebook.ads.InterstitialAdListener
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.loseweight.interfaces.AdsCallback


object CommonConstantAd {

    fun loadBannerGoogleAd(context: Context, llAdview: RelativeLayout, adId: String, type: String) {

        try {
            val adViewBottom = AdView(context)
            if (type.equals("GOOGLE_BANNER_TYPE_AD")) {
                adViewBottom.adSize = AdSize.BANNER
            } else if (type.equals("GOOGLE_RECTANGLE_BANNER_TYPE_AD")) {
                adViewBottom.adSize = AdSize.MEDIUM_RECTANGLE
            }
            adViewBottom.adUnitId = adId
            llAdview.addView(adViewBottom)
            val adRequest = AdRequest.Builder().build()
            adViewBottom.loadAd(adRequest)
            adViewBottom.adListener = object : AdListener() {
                override fun onAdLoaded() {
                    adViewBottom.visibility = View.VISIBLE
                    llAdview.visibility = View.VISIBLE
                    Log.e("TAG", "onAdLoaded:::Google Ad::: ")
                }

                override fun onAdFailedToLoad(p0: LoadAdError?) {
                    llAdview.visibility = View.GONE
                    Log.e("TAG", "onAdFailedToLoad:::Google Ad::: ")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun loadFbAdFacebook(context: Context, banner_container: LinearLayout, adId: String,adType:String) {

        Log.e("TAG", "loadFbAdFacebook::::::::::: ")
        var adView: com.facebook.ads.AdView? = null
        adView = com.facebook.ads.AdView(context, adId, com.facebook.ads.AdSize.BANNER_HEIGHT_50)



        banner_container.addView(adView)

        val adListener: com.facebook.ads.AdListener = object : com.facebook.ads.AdListener {
            override fun onError(ad: Ad?, adError: com.facebook.ads.AdError) {
                // Ad error callback
                Log.e("TAG", "onError:Fb:::: ${adError.errorMessage}  ${adError.errorCode}")
                banner_container.visibility = View.GONE
            }

            override fun onAdLoaded(ad: Ad?) {
                // Ad loaded callback
                Log.e("TAG", "onAdLoaded:::::: ")
                banner_container.visibility = View.VISIBLE
            }

            override fun onAdClicked(ad: Ad?) {
                // Ad clicked callback
            }

            override fun onLoggingImpression(ad: Ad?) {
                // Ad impression logged callback
            }


        }

        adView!!.loadAd(adView.buildLoadAdConfig().withAdListener(adListener).build())
    }


    private fun getAdRequest(): AdRequest {
        return AdRequest.Builder().build()
    }


    /*Google Full Ad*/


    var mInterstitialAd: InterstitialAd? = null
    fun googlebeforloadAd(context: Context,adId:String) {

        try {
            InterstitialAd.load(
                context, adId, getAdRequest(),
                object : InterstitialAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.e("TAG ERRRR:::: ", adError.message)
                        mInterstitialAd = null
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
                        Log.e("TAG", "Ad was loaded.")
                        mInterstitialAd = interstitialAd
                    }
                }
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    fun showInterstitialAdsGoogle(context: Context,adsCallback: AdsCallback) {

        try {
            if (mInterstitialAd != null) {
                mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        Log.d("TAG", "Ad was dismissed.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.startNextScreen()

                    }

                    override fun onAdFailedToShowFullScreenContent(adError: com.google.android.gms.ads.AdError?) {
                        Log.d("TAG", "Ad failed to show.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.startNextScreen()
                    }

                    override fun onAdShowedFullScreenContent() {
                        Log.d("TAG", "Ad showed fullscreen content.")
                        // Called when ad is dismissed.
//                        adsCallback.onLoaded()
                    }
                }
                mInterstitialAd?.show(context as Activity)
            } else {
                Log.e("TAG", "showInterstitialAdsGoogle:::::NOT LOADED:::::  " )
                adsCallback.startNextScreen()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }



    /*Facebook Full Ad*/
    var interstitialAdFb: com.facebook.ads.InterstitialAd? = null
    private var adsCallbackFb: AdsCallback? = null
    fun facebookbeforeloadFullAd(context: Context,adId:String) {
        try {
            interstitialAdFb = com.facebook.ads.InterstitialAd(context, adId)
            adsCallbackFb = null

            val interstitialAdListener: InterstitialAdListener = object : InterstitialAdListener {
                override fun onInterstitialDisplayed(ad: Ad?) {
                    Log.e("TAG", "Interstitial ad displayed.")

                }

                override fun onInterstitialDismissed(ad: Ad?) {
                    Log.e("TAG", "Interstitial ad dismissed.  ${adsCallbackFb.toString()}")
                    adsCallbackFb!!.adClose()
                }

                override fun onError(ad: Ad?, adError: com.facebook.ads.AdError) {
//                    adsCallbackFb!!.adLoadingFailed()
                    Log.e("TAG", "onError:Facebook :::::::::  " )
                }

                override fun onAdLoaded(ad: Ad?) {
                    Log.e("TAG", "Interstitial ad is loaded and ready to be displayed!")
                    // Show the ad
                }

                override fun onAdClicked(ad: Ad?) {
                    Log.e("TAG", "Interstitial ad clicked!")
                }

                override fun onLoggingImpression(ad: Ad?) {
                    Log.e("TAG", "Interstitial ad impression logged!")
                }
            }

            interstitialAdFb!!.loadAd(
                interstitialAdFb!!.buildLoadAdConfig()
                    .withAdListener(interstitialAdListener)
                    .build()
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }
    fun showInterstitialAdsFacebook(adsCallbackFb: AdsCallback) {
        CommonConstantAd.adsCallbackFb = adsCallbackFb
        if (interstitialAdFb != null) {
            if (interstitialAdFb!!.isAdLoaded) {
                interstitialAdFb!!.show()
            } else {
                adsCallbackFb.startNextScreen()
            }
        } else {
            adsCallbackFb.startNextScreen()
        }
    }


    /*Google Full Ad*/


    var mRewardedAd: RewardedAd? = null
    fun loadRewardedAdGoogle(context: Context) {

        try {


            RewardedAd.load(
                context, "ca-app-pub-3940256099942544/5224354917", getAdRequest(),
                object : RewardedAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.e("TAG ERRRR:::: ", adError.message)
                        mRewardedAd = null
                    }

                    override fun onAdLoaded(rewardedAd: RewardedAd) {
                        Log.e("TAG", "Ad was loaded.")
                        mRewardedAd = rewardedAd
                    }
                }
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    fun showRewardedAdGoogle(context: Context,adsCallback: AdsCallback) {

        try {
            if (mRewardedAd != null) {
                mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        Log.d("TAG", "Ad was dismissed.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.adClose()

                    }

                    override fun onAdFailedToShowFullScreenContent(adError: com.google.android.gms.ads.AdError?) {
                        Log.d("TAG", "Ad failed to show.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.adClose()
                    }

                    override fun onAdShowedFullScreenContent() {
                        Log.d("TAG", "Ad showed fullscreen content.")
                        // Called when ad is dismissed.
//                        adsCallback.onLoaded()
                    }
                }
                mRewardedAd?.show(context as Activity) { adsCallback.startNextScreen() }
            } else {
                Log.e("TAG", "showInterstitialAdsGoogle:::::NOT LOADED:::::  " )
                adsCallback.startNextScreen()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}
