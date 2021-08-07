
# 顶顶顶到达
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

