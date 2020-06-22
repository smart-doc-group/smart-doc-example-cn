

## app端接口测试
### app测试
**URL:** http://localhost:8080/app/test

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/app/test
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
attributes|object|No comments found.|-
└─namedItem|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─attributes|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentNode|object|No comments found.|-
└─namedItemNS|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─attributes|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentNode|object|No comments found.|-
parentNode|object|No comments found.|-


## 错误码列表
Error code |Description
---|---
0000|success
1001|必选参数为空
1002|参数格式错误
9999|系统繁忙，请稍后再试....

## 数据字典
### 订单状态

Code |Type|Description
---|---|---
0|string|已支付
1|string|已支付
2|string|已经失效
### 订单状态1

Code |Type|Description
---|---|---
0|string|已支付
1|string|已支付
2|string|已经失效
### 性别字典

Code |Type|Description
---|---|---
0|int32|女人
2|int32|男人
