
# 注释tag用例
## ~~测试apiNote tag~~
**URL:** `http://localhost:8080/tags/apiNote`

**Type:** `POST`

**Author:** "cht"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Thismethod returns a List instead of a Collection or Stream,<br>because processing of multiple Wombats usually involves traversing<br>the list in alternating forward and reverse directions.



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
user|array|No comments found.,[array of string]|false|


**Request-example:**
```
curl -X POST -i http://localhost:8080/tags/apiNote --data 'user=c00ntu&user=c00ntu'
```

**Response-example:**
```
string
```

## 自定义mock tag获取mock值
**URL:** `http://localhost:8080/tags/mock`

**Type:** `POST`

**Author:** yu 2020/7/2.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 自定义mock tag获取mock值




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
subUserName|string|用户名称|true|-
numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/tags/mock --data '{
  "subUserName": "张三",
  "numbers": 65
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─MAX_SPEED|int32|No comments found.|-
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─roles|array|用户角色信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|No comments found.|-
└─extend|map|用户扩展项|-
└─listMap|array|ListMap效果展示|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{"success":true,"message":"success","data":{"MAX_SPEED":701,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"x7v5sj","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"t8w6b6","createTime":"2021-08-07 15:39:05","updateBy":"ylvkjf","updateTime":"2021-08-07 15:39:05","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"62125","timestamp":"2021-08-07 15:39:03"}
```

## 测试@ignore tag
**URL:** `http://localhost:8080/tags/ignore`

**Type:** `GET`

**Author:** yu 2020/7/2.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试@ignore tag



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
total|int32|记录总数|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/tags/ignore?total=976
```

**Response-example:**
```
string
```

