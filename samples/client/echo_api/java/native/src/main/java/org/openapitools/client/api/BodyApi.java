/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.Pet;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BodyApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public BodyApi() {
    this(new ApiClient());
  }

  public BodyApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyPet(Pet pet) throws ApiException {
    ApiResponse<Pet> localVarResponse = testEchoBodyPetWithHttpInfo(pet);
    return localVarResponse.getData();
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Pet> testEchoBodyPetWithHttpInfo(Pet pet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyPetRequestBuilder(pet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyPet", localVarResponse);
        }
        return new ApiResponse<Pet>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Pet>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyPetRequestBuilder(Pet pet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/Pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(pet);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyPetResponseString(Pet pet) throws ApiException {
    ApiResponse<String> localVarResponse = testEchoBodyPetResponseStringWithHttpInfo(pet);
    return localVarResponse.getData();
  }

  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testEchoBodyPetResponseStringWithHttpInfo(Pet pet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyPetResponseStringRequestBuilder(pet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyPetResponseString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyPetResponseStringRequestBuilder(Pet pet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/Pet/response_string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(pet);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
