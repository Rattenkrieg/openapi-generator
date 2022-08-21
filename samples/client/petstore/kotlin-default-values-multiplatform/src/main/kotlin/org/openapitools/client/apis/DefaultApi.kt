/**
 * Demo
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis


import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class DefaultApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Tests default values
     * Tests default values of different parameters
     * @param pi0  (default to 10)
     * @param pi1 
     * @param pn0  (default to 10.0)
     * @param pn1 
     * @param qi0  (optional, default to 10)
     * @param qi1  (default to 71)
     * @param qi2  (optional)
     * @param qi3 
     * @param qn0  (optional, default to 10.0)
     * @param qn1  (default to 71.0)
     * @param qn2  (optional)
     * @param qn3 
     * @param hi0  (optional, default to 10)
     * @param hi1  (default to 71)
     * @param hi2  (optional)
     * @param hi3 
     * @param hn0  (optional, default to 10.0)
     * @param hn1  (default to 71.0)
     * @param hn2  (optional)
     * @param hn3 
     * @param fi0  (optional, default to 10)
     * @param fi1  (default to 71)
     * @param fi2  (optional)
     * @param fi3 
     * @param fn0  (optional, default to 10.0)
     * @param fn1  (default to 71.0)
     * @param fn2  (optional)
     * @param fn3 
     * @param fn4 
     * @return void
     */
    open suspend fun test(pi0: kotlin.Int = 10, pi1: kotlin.Int, pn0: kotlin.Double = 10.0.toDouble(), pn1: kotlin.Double, qi0: kotlin.Int? = 10, qi1: kotlin.Int = 71, qi2: kotlin.Int? = null, qi3: kotlin.Int, qn0: kotlin.Double? = 10.0.toDouble(), qn1: kotlin.Double = 71.0.toDouble(), qn2: kotlin.Double? = null, qn3: kotlin.Double, hi0: kotlin.Int? = 10, hi1: kotlin.Int = 71, hi2: kotlin.Int? = null, hi3: kotlin.Int, hn0: kotlin.Double? = 10.0.toDouble(), hn1: kotlin.Double = 71.0.toDouble(), hn2: kotlin.Double? = null, hn3: kotlin.Double, fi0: kotlin.Int? = 10, fi1: kotlin.Int = 71, fi2: kotlin.Int? = null, fi3: kotlin.Int, fn0: kotlin.Double? = 10.0.toDouble(), fn1: kotlin.Double = 71.0.toDouble(), fn2: kotlin.Double? = null, fn3: kotlin.Double, fn4: kotlin.collections.List<kotlin.String>): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            formData {
                fi0?.apply { append("fi0", fi0) }
                fi1?.apply { append("fi1", fi1) }
                fi2?.apply { append("fi2", fi2) }
                fi3?.apply { append("fi3", fi3) }
                fn0?.apply { append("fn0", fn0) }
                fn1?.apply { append("fn1", fn1) }
                fn2?.apply { append("fn2", fn2) }
                fn3?.apply { append("fn3", fn3) }
                fn4?.apply { append("fn4", fn4) }
            }

        val localVariableQuery = mutableMapOf<String, List<String>>()
        qi0?.apply { localVariableQuery["qi0"] = listOf("$qi0") }
        qi1?.apply { localVariableQuery["qi1"] = listOf("$qi1") }
        qi2?.apply { localVariableQuery["qi2"] = listOf("$qi2") }
        qi3?.apply { localVariableQuery["qi3"] = listOf("$qi3") }
        qn0?.apply { localVariableQuery["qn0"] = listOf("$qn0") }
        qn1?.apply { localVariableQuery["qn1"] = listOf("$qn1") }
        qn2?.apply { localVariableQuery["qn2"] = listOf("$qn2") }
        qn3?.apply { localVariableQuery["qn3"] = listOf("$qn3") }
        val localVariableHeaders = mutableMapOf<String, String>()
        hi0?.apply { localVariableHeaders["hi0"] = this.toString() }
        hi1?.apply { localVariableHeaders["hi1"] = this.toString() }
        hi2?.apply { localVariableHeaders["hi2"] = this.toString() }
        hi3?.apply { localVariableHeaders["hi3"] = this.toString() }
        hn0?.apply { localVariableHeaders["hn0"] = this.toString() }
        hn1?.apply { localVariableHeaders["hn1"] = this.toString() }
        hn2?.apply { localVariableHeaders["hn2"] = this.toString() }
        hn3?.apply { localVariableHeaders["hn3"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/test".replace("{" + "pi0" + "}", "$pi0").replace("{" + "pi1" + "}", "$pi1").replace("{" + "pn0" + "}", "$pn0").replace("{" + "pn1" + "}", "$pn1"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return multipartFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
