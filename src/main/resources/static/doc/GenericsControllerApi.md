
# java泛型解析测试
## 测试多泛型1
**URL:** `http://localhost:8080/generics/test1`

**Type:** `GET`

**Author:** yu 2020/7/2.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试多泛型1





**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
test|string|托尔斯泰|-
value|object|value|-
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
key|object|key|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-

**Response-example:**
```
{"test":"5owwor","value":{"MAX_SPEED":986,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"wtkjmz","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"0jzuq3","createTime":"2021-08-07 15:39:04","updateBy":"4ogxgp","updateTime":"2021-08-07 15:39:04","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"key":{"roleId":824,"roleName":"adam.gibson","age":49}}
```

## 测试多泛型2
**URL:** `http://localhost:8080/generics/test2`

**Type:** `GET`

**Author:** yu 2020/7/2.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试多泛型2





**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
total|int32|总条数|-
other|object|其他信息|-
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
rows|array|数据列表|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-

**Response-example:**
```
{"total":793,"other":{"MAX_SPEED":651,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"z7aeiy","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"vb632w","createTime":"2021-08-07 15:39:04","updateBy":"5ppmt2","updateTime":"2021-08-07 15:39:04","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"rows":[{"roleId":430,"roleName":"adam.gibson","age":49}]}
```

## 测试单泛型嵌套
**URL:** `http://localhost:8080/generics/test3`

**Type:** `GET`

**Author:** yu 2020/7/2.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试单泛型嵌套





**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "roleId": 626,
    "roleName": "adam.gibson",
    "age": 49
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

