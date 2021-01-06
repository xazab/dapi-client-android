/**
 * Copyright (c) 2018-present, Dash Core Team
 *
 * This source code is licensed under the MIT license found in the
 * COPYING file in the root directory of this source tree.
 */
package org.xazab.dapiclient.rest
import org.xazab.dapiclient.model.JsonRPCRequest
import org.xazab.dapiclient.model.JsonRPCResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DapiService {

    @POST("/")
    fun getBestBlockHash(@Body body: JsonRPCRequest<Map<String, String>>) : Call<JsonRPCResponse<String>>

    @POST ("/")
    fun getBlockHash(@Body body: JsonRPCRequest<Map<String, String>>): Call<JsonRPCResponse<String>>

    @POST ("/")
    fun getMnListDiff(@Body body: JsonRPCRequest<Map<String, String>>) : Call<JsonRPCResponse<Map<String, Any>>>

}