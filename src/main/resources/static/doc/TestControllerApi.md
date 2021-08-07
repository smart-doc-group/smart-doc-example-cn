
# 继承接口测试
## 继承接口测试
**URL:** `http://localhost:8080/parentExtends/update`

**Type:** `GET`

**Author:** xingzi

**Content-Type:** `application/json; charset=utf-8`

**Description:** 继承接口测试




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/update --data '{"MAX_SPEED":828,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"0brzz6","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"4v3iuo","createTime":"2021-08-07 15:39:04","updateBy":"2bkbam","updateTime":"2021-08-07 15:39:04","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
{"success":true,"message":"success","data":{"MAX_SPEED":662,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"h7w0p4","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"k073pa","createTime":"2021-08-07 15:39:04","updateBy":"8bkdfy","updateTime":"2021-08-07 15:39:04","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"62125","timestamp":"2021-08-07 15:39:03"}
```

## 根据Id删除
**URL:** `http://localhost:8080/parentExtends/deleteById/{id}`

**Type:** `DELETE`

**Author:** xingzi

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 根据Id删除



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|object|id|false|-


**Request-example:**
```
curl -X DELETE -i http://localhost:8080/parentExtends/deleteById/{id}?id=tk6u1g
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

## 根据Id更新
**URL:** `http://localhost:8080/parentExtends/updateById`

**Type:** `PUT`

**Author:** xingzi

**Content-Type:** `application/json; charset=utf-8`

**Description:** 根据Id更新




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/updateById --data '{"MAX_SPEED":562,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"nv6mg5","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"tepw1x","createTime":"2021-08-07 15:39:04","updateBy":"dlxz3n","updateTime":"2021-08-07 15:39:04","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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

