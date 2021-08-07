
# json文件配置全局参数测试
## get请求测试query参数
**URL:** `http://localhost:8080/configQueryParamGet`

**Type:** `GET`

**Author:** "cqmike"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** get请求测试query参数



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/configQueryParamGet?configQueryParam=1gvaos
```

**Response-example:**
```
Doesn't return a value.
```

## post请求测试query参数
**URL:** `http://localhost:8080/configQueryParamPost`

**Type:** `POST`

**Author:** "cqmike"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** post请求测试query参数



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-


**Request-example:**
```
curl -X POST -i http://localhost:8080/configQueryParamPost --data 'configQueryParam=pmsttn'
```

**Response-example:**
```
Doesn't return a value.
```

## get请求测试query参数和path参数
**URL:** `http://localhost:8080/configParamGet/{configPathParam}`

**Type:** `GET`

**Author:** "cqmike"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** get请求测试query参数和path参数


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configPathParam|string|No comments found.|true|-

**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/configParamGet/nusxpn?configQueryParam=twskgu
```

**Response-example:**
```
Doesn't return a value.
```

## post请求测试query参数和path参数
**URL:** `http://localhost:8080/configParamPost/{configPathParam}`

**Type:** `POST`

**Author:** "cqmike"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** post请求测试query参数和path参数


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configPathParam|string|No comments found.|true|-

**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-


**Request-example:**
```
curl -X POST -i http://localhost:8080/configParamPost/zzltl5 --data 'configQueryParam=jmnt32'
```

**Response-example:**
```
Doesn't return a value.
```

