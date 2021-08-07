
# 文件下载
## 下载文件
**URL:** `http://localhost:8080/download1/{filename}`

**Type:** `POST`

**Author:** yu 2021/5/29.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** smart-doc自动识别文件流对象，不需要做文件下载标记


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
filename|string|文件名|true|-



**Request-example:**
```
curl -X POST -i http://localhost:8080/download1/me
```

**Response-example:**
```
File download.
```

## 下载普通文件文件
**URL:** `http://localhost:8080/text/`

**Type:** `POST`

**Author:** yu 2021/5/29.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 方法没有返回对象可以识别，需要做download标记





**Request-example:**
```
curl -X POST -i http://localhost:8080/text/
```

**Response-example:**
```
Doesn't return a value.
```

## 分页查询
**URL:** `http://localhost:8080/list`

**Type:** `POST`

**Author:** yu 2021/5/29.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 分页查询





**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/list --data '{}'
```

**Response-example:**
```
{}
```

