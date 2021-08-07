
# 异步返回信息测试
## 返回Callable&lt;CommonResult&gt;
**URL:** `http://localhost:8080/testCallable`

**Type:** `GET`

**Author:** yu 2019/9/22.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回Callable&lt;CommonResult&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/testCallable
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** `http://localhost:8080/async-deferredresult`

**Type:** `GET`

**Author:** yu 2019/9/22.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/async-deferredresult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": "csxs93",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** `http://localhost:8080/WebAsync/timeout`

**Type:** `GET`

**Author:** yu 2019/9/22.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/WebAsync/timeout
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** `http://localhost:8080/future`

**Type:** `GET`

**Author:** yu 2019/9/22.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/future
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": "whj0sf",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** `http://localhost:8080/completableFuture`

**Type:** `GET`

**Author:** yu 2019/9/22.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/completableFuture
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": "ighjuh",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

