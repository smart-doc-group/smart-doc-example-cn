
# 顶顶顶到达1
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

