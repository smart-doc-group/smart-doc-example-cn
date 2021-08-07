
# 请求类型测试
## 测试GetMapping 无参数
**URL:** `http://localhost:8080/getMapping1`

**Type:** `GET`

**Author:** zhangsan, wangwu

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试GetMapping 无参数





**Request-example:**
```
curl -X GET -i http://localhost:8080/getMapping1
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PostMapping 无参数
**URL:** `http://localhost:8080/PostMapping1`

**Type:** `POST`

**Author:** "songhaozhi"

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试PostMapping 无参数





**Request-example:**
```
curl -X POST -i http://localhost:8080/PostMapping1
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PutMapping 无参数
**URL:** `http://localhost:8080/PutMapping1`

**Type:** `PUT`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试PutMapping 无参数





**Request-example:**
```
curl -X PUT -i http://localhost:8080/PutMapping1
```

**Response-example:**
```
Doesn't return a value.
```

## DeleteMapping 无参数
**URL:** `http://localhost:8080/DeleteMapping1`

**Type:** `DELETE`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** DeleteMapping 无参数





**Request-example:**
```
curl -X DELETE -i http://localhost:8080/DeleteMapping1
```

**Response-example:**
```
Doesn't return a value.
```

## 测试GetMapping
**URL:** `http://localhost:8080/getMapping`

**Type:** `GET`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试GetMapping



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/getMapping?userId=688
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PostMapping json
**URL:** `http://localhost:8080/postMapping`

**Type:** `POST`

**Author:** songhaozhi,test

**Content-Type:** `application/json; charset=utf-8`

**Description:** 测试PostMapping json




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/postMapping --data '{
  "id": "67",
  "createBy": "xp5xql",
  "createTime": "2021-08-07 15:39:05",
  "updateBy": "c13tru",
  "updateTime": "2021-08-07 15:39:05",
  "delFlag": 2,
  "username": "adam.gibson",
  "password": "21vtjg",
  "nickName": "shannon.williamson",
  "mobile": "(817) 227-6384",
  "email": "mirian.brekke@hotmail.com",
  "address": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "sex": 0,
  "avatar": "0srq63",
  "type": 312,
  "status": 960,
  "description": "1rt6jm",
  "roles": [
    {
      "id": "67",
      "createBy": "9bsqkw",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "9mp260",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "defaultRole": true,
      "permissions": [
        {
          "id": "67",
          "createBy": "sjiqst",
          "createTime": "2021-08-07 15:39:05",
          "updateBy": "uj0amp",
          "updateTime": "2021-08-07 15:39:05",
          "delFlag": 2,
          "name": "adam.gibson",
          "level": 403,
          "type": 607,
          "title": "nxyf2m",
          "path": "vo6nsu",
          "component": "9p25l3",
          "icon": "w06e3z",
          "buttonType": "gj4iyv",
          "parentId": "67",
          "description": "gvn96t",
          "sortOrder": 196,
          "status": 378,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "udql2h"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "67",
      "createBy": "7zlofa",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "r01pig",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "level": 801,
      "type": 236,
      "title": "sm0d0g",
      "path": "kg0she",
      "component": "aewipb",
      "icon": "hnmv1j",
      "buttonType": "snwktm",
      "parentId": "67",
      "description": "2nsjjw",
      "sortOrder": 669,
      "status": 214,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "jvjtiq"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}'
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PostMapping表单
**URL:** `http://localhost:8080/postMapping2`

**Type:** `POST`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试PostMapping表单



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-


**Request-example:**
```
curl -X POST -i http://localhost:8080/postMapping2 --data 'permissions[0].createTime=2021-08-07 15:39:05&permissions[0].delFlag=2&permissions[0].id=67&roles[0].permissions[0].updateBy=wul6nl&permissions[0].description=3puabl&roles[0].permissions[0].status=577&roles[0].defaultRole=true&id=67&roles[0].permissions[0].createTime=2021-08-07 15:39:05&nickName=shannon.williamson&roles[0].permissions[0].checked=true&description=botzki&roles[0].permissions[0].title=x384iu&roles[0].permissions[0].selected=true&updateBy=pffoie&permissions[0].title=o2w9oe&permissions[0].buttonType=07ku0j&roles[0].permissions[0].level=128&roles[0].createBy=5w4skq&permissions[0].expand=true&mobile=(817) 227-6384&roles[0].permissions[0].createBy=tqb82c&username=adam.gibson&createTime=2021-08-07 15:39:05&permissions[0].type=633&permissions[0].sortOrder=627&roles[0].permissions[0].icon=3rjafe&avatar=xsislg&roles[0].updateBy=gxqx03&roles[0].id=67&type=386&email=mirian.brekke@hotmail.com&roles[0].permissions[0].buttonType=1y04pd&sex=0&roles[0].updateTime=2021-08-07 15:39:05&permissions[0].createBy=gcq0c2&permissions[0].component=el18w0&delFlag=2&roles[0].permissions[0].type=185&permissions[0].updateBy=f36cv4&permissions[0].level=179&permissions[0].name=adam.gibson&status=478&roles[0].permissions[0].id=67&roles[0].permissions[0].name=adam.gibson&roles[0].createTime=2021-08-07 15:39:05&permissions[0].checked=true&roles[0].permissions[0].sortOrder=253&permissions[0].parentId=67&updateTime=2021-08-07 15:39:05&roles[0].permissions[0].updateTime=2021-08-07 15:39:05&permissions[0].path=d9o2ev&permissions[0].selected=true&permissions[0].status=431&permissions[0].updateTime=2021-08-07 15:39:05&roles[0].permissions[0].path=50nydx&roles[0].permissions[0].description=1kyhyq&roles[0].permissions[0].parentId=67&createBy=suo9js&roles[0].permissions[0].component=b5sn7d&roles[0].name=adam.gibson&permissions[0].icon=pj2dzc&address=6133 Alfredo Knoll， North Stormyfort， WV 13566-4252&roles[0].permissions[0].expand=true&roles[0].permissions[0].delFlag=2&password=z8qyes&roles[0].delFlag=2'
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PutMapping json
**URL:** `http://localhost:8080/putMapping`

**Type:** `PUT`

**Author:** songhaozhi,test

**Content-Type:** `application/json; charset=utf-8`

**Description:** 测试PutMapping json




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/putMapping --data '{
  "id": "67",
  "createBy": "o7c6ze",
  "createTime": "2021-08-07 15:39:05",
  "updateBy": "v6d5dt",
  "updateTime": "2021-08-07 15:39:05",
  "delFlag": 2,
  "username": "adam.gibson",
  "password": "4dgjxl",
  "nickName": "shannon.williamson",
  "mobile": "(817) 227-6384",
  "email": "mirian.brekke@hotmail.com",
  "address": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "sex": 0,
  "avatar": "u74sup",
  "type": 404,
  "status": 85,
  "description": "wy8yv7",
  "roles": [
    {
      "id": "67",
      "createBy": "d44fhg",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "vjm4lb",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "defaultRole": true,
      "permissions": [
        {
          "id": "67",
          "createBy": "l5lr5q",
          "createTime": "2021-08-07 15:39:05",
          "updateBy": "hvvmut",
          "updateTime": "2021-08-07 15:39:05",
          "delFlag": 2,
          "name": "adam.gibson",
          "level": 775,
          "type": 809,
          "title": "h6uxg0",
          "path": "pczn68",
          "component": "c62f3p",
          "icon": "2tkhh3",
          "buttonType": "ronoog",
          "parentId": "67",
          "description": "jikrze",
          "sortOrder": 31,
          "status": 696,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "nkjeft"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "67",
      "createBy": "drp2l8",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "ffwbjp",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "level": 52,
      "type": 729,
      "title": "lmm8y7",
      "path": "f4xylw",
      "component": "82ftyc",
      "icon": "vi5qtf",
      "buttonType": "kn9rth",
      "parentId": "67",
      "description": "jf0zxb",
      "sortOrder": 5,
      "status": 612,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "8mugdw"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}'
```

**Response-example:**
```
Doesn't return a value.
```

## 测试PutMapping表单
**URL:** `http://localhost:8080/putMapping2`

**Type:** `PUT`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试PutMapping表单



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-


**Request-example:**
```
curl -X PUT -i http://localhost:8080/putMapping2 --data 'roles[0].permissions[0].createBy=7b4hdo&nickName=shannon.williamson&roles[0].permissions[0].sortOrder=197&roles[0].permissions[0].component=74662m&permissions[0].icon=0j6opd&roles[0].permissions[0].type=819&roles[0].permissions[0].id=67&roles[0].updateBy=6clwar&permissions[0].delFlag=2&createBy=abbrm7&permissions[0].level=261&type=687&delFlag=2&roles[0].permissions[0].name=adam.gibson&permissions[0].type=224&status=726&roles[0].permissions[0].level=425&username=adam.gibson&roles[0].permissions[0].updateBy=b12w7c&roles[0].permissions[0].description=p3kdfg&roles[0].createTime=2021-08-07 15:39:05&roles[0].permissions[0].buttonType=v7hbvi&roles[0].permissions[0].parentId=67&roles[0].permissions[0].checked=true&permissions[0].title=ibey77&sex=0&permissions[0].id=67&avatar=nr7cva&address=6133 Alfredo Knoll， North Stormyfort， WV 13566-4252&permissions[0].buttonType=hb4exf&password=atdt0u&mobile=(817) 227-6384&roles[0].name=adam.gibson&description=vv82qv&roles[0].permissions[0].updateTime=2021-08-07 15:39:05&permissions[0].updateTime=2021-08-07 15:39:05&permissions[0].parentId=67&permissions[0].name=adam.gibson&roles[0].defaultRole=true&permissions[0].selected=true&roles[0].permissions[0].createTime=2021-08-07 15:39:05&createTime=2021-08-07 15:39:05&updateBy=2ethw9&email=mirian.brekke@hotmail.com&permissions[0].createTime=2021-08-07 15:39:05&permissions[0].description=2yquxy&roles[0].permissions[0].delFlag=2&roles[0].delFlag=2&roles[0].permissions[0].selected=true&roles[0].permissions[0].expand=true&permissions[0].updateBy=n1wd00&roles[0].permissions[0].status=2&updateTime=2021-08-07 15:39:05&permissions[0].component=zrohsj&permissions[0].path=ip3bl6&roles[0].updateTime=2021-08-07 15:39:05&permissions[0].createBy=gkdejx&roles[0].permissions[0].title=ppd7ih&roles[0].createBy=la4olq&roles[0].permissions[0].path=cgmsuf&roles[0].id=67&permissions[0].expand=true&id=67&permissions[0].checked=true&permissions[0].status=121&permissions[0].sortOrder=772&roles[0].permissions[0].icon=yj5n0r'
```

**Response-example:**
```
Doesn't return a value.
```

## 测试DeleteMapping
**URL:** `http://localhost:8080/deleteMapping`

**Type:** `DELETE`

**Author:** songhaozhi,test

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试DeleteMapping



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-


**Request-example:**
```
curl -X DELETE -i http://localhost:8080/deleteMapping?userId=964
```

**Response-example:**
```
Doesn't return a value.
```

