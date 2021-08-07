
# JDK8的时间测试
## LocalDate和LocalDateTime测试
**URL:** `http://localhost:8080/dateEntity`

**Type:** `POST`

**Author:** yu 2019/9/22.

**Content-Type:** `application/json; charset=utf-8`

**Description:** LocalDate和LocalDateTime测试




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
createDate|string|创建时间|false|v1.0
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0
localTime|string|jdk8 LocalTime|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/dateEntity --data '{
  "createDate": "2021-08-07 15:39:04",
  "localDate": "2021-08-07",
  "localDateTime": "2021-08-07 15:39:04",
  "localTime": "2021-08-07 15:39:03"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
createDate|string|创建时间|v1.0
localDate|string|创建日期|v1.0
localDateTime|string|创建时间|v1.0
localTime|string|jdk8 LocalTime|-

**Response-example:**
```
{
  "createDate": "2021-08-07 15:39:04",
  "localDate": "2021-08-07",
  "localDateTime": "2021-08-07 15:39:04",
  "localTime": "2021-08-07 15:39:03"
}
```

