
# 接收表单参数
## Post请求发表单文件
**URL:** `http://localhost:8080/formData2`

**Type:** `POST`

**Author:** yu 2019/10/29.

**Content-Type:** `multipart/form-data`

**Description:** Post请求发表单文件



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file|No comments found.|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2 --data 'userData=1dlk8l&userId=67'
```

**Response-example:**
```
Doesn't return a value.
```

## Get请求发表单文件 暂不支持完全解析
**URL:** `http://localhost:8080/formData2`

**Type:** `GET`

**Author:** yu 2019/10/29.

**Content-Type:** `multipart/form-data`

**Description:** Get请求发表单文件 暂不支持完全解析



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file|No comments found.|true|-


**Request-example:**
```
curl -X GET -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2?userData=gb2lbo&userId=67
```

**Response-example:**
```
Doesn't return a value.
```

## 表单 包含复杂对象的Get 暂不支持完全解析
**URL:** `http://localhost:8080/formData4`

**Type:** `GET`

**Author:** yu 2019/10/29.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 表单 包含复杂对象的Get 暂不支持完全解析



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
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
curl -X GET -i http://localhost:8080/formData4?password=994zcw&roles[0].updateTime=2021-08-07 15:39:04&userId=67&username=adam.gibson&userData=fgqx30&MAX_SPEED=703&roles[0].createTime=2021-08-07 15:39:04&gender=WOMAN&roles[0].roleName=adam.gibson&roles[0].userId=67&simpleEnum=RED&roles[0].delFlag=2&mobile=(817) 227-6384&roles[0].updateBy=kukd5o&nickName=shannon.williamson&roles[0].createBy=de1m3g&roles[0].roleId=67&roles[0].id=67
```

**Response-example:**
```
Doesn't return a value.
```

## 测试formData带路径参数
**URL:** `http://localhost:8080/formData7/{id}`

**Type:** `POST`

**Author:** yu 2019/10/29.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试formData带路径参数


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-

**Query-parameters:**

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
curl -X POST -i http://localhost:8080/formData7/67 --data 'roles[0].userId=67&password=e42wfe&roles[0].createTime=2021-08-07 15:39:04&mobile=(817) 227-6384&roles[0].id=67&simpleEnum=RED&gender=WOMAN&nickName=shannon.williamson&roles[0].createBy=qwtvwo&roles[0].updateBy=tcgzpm&username=adam.gibson&roles[0].updateTime=2021-08-07 15:39:04&roles[0].delFlag=2&roles[0].roleName=adam.gibson&roles[0].roleId=67&MAX_SPEED=504'
```

**Response-example:**
```
Doesn't return a value.
```

## 测试formData带路多个路径参数
**URL:** `http://localhost:8080/formData8/{id}/{age}`

**Type:** `POST`

**Author:** yu 2019/10/29.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试formData带路多个路径参数


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-
age|int32|No comments found.|true|-

**Query-parameters:**

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
curl -X POST -i http://localhost:8080/formData8/67/49 --data 'simpleEnum=RED&nickName=shannon.williamson&roles[0].updateTime=2021-08-07 15:39:04&roles[0].delFlag=2&roles[0].userId=67&roles[0].id=67&roles[0].updateBy=a246gz&roles[0].createTime=2021-08-07 15:39:04&mobile=(817) 227-6384&MAX_SPEED=108&roles[0].roleId=67&roles[0].roleName=adam.gibson&gender=WOMAN&username=adam.gibson&password=mcjy3n&roles[0].createBy=l30rar'
```

**Response-example:**
```
Doesn't return a value.
```

