package com.zerosdev.base.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlin.coroutines.CoroutineContext

open class BaseViewModel : ViewModel() {

    //create a new Job
    private val parentJob = Job()
    //create a coroutine context with the job and the dispatcher
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Default
    //create a coroutine scope with the coroutine context
    protected val scope = CoroutineScope(coroutineContext)
    //live data that will be populated as news messages

    override fun onCleared() {
        super.onCleared()
        cancelRequest()
    }

    private fun cancelRequest() = coroutineContext.cancel()

}