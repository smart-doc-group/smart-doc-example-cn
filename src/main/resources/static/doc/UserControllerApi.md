
# 用户信息操作接口
## 添加用户
**URL:** `http://localhost:8080/user/add`

**Type:** `POST`

**Author:** yu 2018/8/4.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 添加用户




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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/add --data '{"MAX_SPEED":823,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"bz8pc8","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"vlh3mg","createTime":"2021-08-07 15:39:05","updateBy":"mstfb5","updateTime":"2021-08-07 15:39:05","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|自增编号|v1.0
createBy|string|创建人|v1.2
createTime|string|创建时间|v1.0
updateBy|string|修改人|v1.1
updateTime|string|修改时间|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
username|string|用户名|-
password|string|密码|-
nickName|string|昵称|-
mobile|string|电话|-
email|string|邮箱|-
address|string|地址|-
sex|int32|性别(男1 女 2)|-
avatar|string|No comments found.|-
type|int32|类型|-
status|int32|状态|-
description|string|描述|-
roles|array|用户拥有角色|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|角色名 以ROLE_开头|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
permissions|array|用户拥有的权限|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|菜单/权限名称|-
└─level|int32|层级|-
└─type|int32|类型 0页面 1具体操作|-
└─title|string|菜单标题|-
└─path|string|页面路径/资源链接url|-
└─component|string|前端组件|-
└─icon|string|图标|-
└─buttonType|string|按钮权限类型|-
└─parentId|string|父id|-
└─description|string|说明备注|-
└─sortOrder|number|排序值|-
└─status|int32|是否启用 0启用 -1禁用|-
└─children|array|子菜单/权限|-
└─permTypes|array|页面拥有的权限类型|-
└─expand|boolean|节点展开 前端所需|-
└─checked|boolean|是否勾选 前端所需|-
└─selected|boolean|是否选中 前端所需|-

**Response-example:**
```
{
  "id": "67",
  "createBy": "lmwr2v",
  "createTime": "2021-08-07 15:39:05",
  "updateBy": "7o550v",
  "updateTime": "2021-08-07 15:39:05",
  "delFlag": 2,
  "username": "adam.gibson",
  "password": "volfdr",
  "nickName": "shannon.williamson",
  "mobile": "(817) 227-6384",
  "email": "mirian.brekke@hotmail.com",
  "address": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "sex": 0,
  "avatar": "e50vb1",
  "type": 162,
  "status": 120,
  "description": "lil8jz",
  "roles": [
    {
      "id": "67",
      "createBy": "dchepq",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "4nkim4",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "defaultRole": true,
      "permissions": [
        {
          "id": "67",
          "createBy": "yghdzd",
          "createTime": "2021-08-07 15:39:05",
          "updateBy": "vribsr",
          "updateTime": "2021-08-07 15:39:05",
          "delFlag": 2,
          "name": "adam.gibson",
          "level": 619,
          "type": 112,
          "title": "zkr4oh",
          "path": "tj720d",
          "component": "mvglx8",
          "icon": "5xbsmz",
          "buttonType": "qwma0e",
          "parentId": "67",
          "description": "4d0r0r",
          "sortOrder": 238,
          "status": 237,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "t0x5mk"
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
      "createBy": "ef8iyw",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "tvzsml",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "level": 358,
      "type": 707,
      "title": "oa3wua",
      "path": "e8gqdf",
      "component": "zzvy8r",
      "icon": "20cz4m",
      "buttonType": "e6he4i",
      "parentId": "67",
      "description": "8qk16l",
      "sortOrder": 91,
      "status": 833,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "qxn7ew"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}
```

## 更新用户
**URL:** `http://localhost:8080/user/update`

**Type:** `PUT`

**Author:** yu 2018/8/4.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 更新用户




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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/update --data '{"MAX_SPEED":402,"gender":0,"simpleEnum":"RED","username":"adam.gibson","password":"qplvaa","nickName":"shannon.williamson","mobile":"(817) 227-6384","roles":[{"id":"67","createBy":"slwo43","createTime":"2021-08-07 15:39:05","updateBy":"uexncw","updateTime":"2021-08-07 15:39:05","delFlag":2,"userId":"67","roleId":"67","roleName":"adam.gibson"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|自增编号|v1.0
createBy|string|创建人|v1.2
createTime|string|创建时间|v1.0
updateBy|string|修改人|v1.1
updateTime|string|修改时间|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
username|string|用户名|-
password|string|密码|-
nickName|string|昵称|-
mobile|string|电话|-
email|string|邮箱|-
address|string|地址|-
sex|int32|性别(男1 女 2)|-
avatar|string|No comments found.|-
type|int32|类型|-
status|int32|状态|-
description|string|描述|-
roles|array|用户拥有角色|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|角色名 以ROLE_开头|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
permissions|array|用户拥有的权限|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|菜单/权限名称|-
└─level|int32|层级|-
└─type|int32|类型 0页面 1具体操作|-
└─title|string|菜单标题|-
└─path|string|页面路径/资源链接url|-
└─component|string|前端组件|-
└─icon|string|图标|-
└─buttonType|string|按钮权限类型|-
└─parentId|string|父id|-
└─description|string|说明备注|-
└─sortOrder|number|排序值|-
└─status|int32|是否启用 0启用 -1禁用|-
└─children|array|子菜单/权限|-
└─permTypes|array|页面拥有的权限类型|-
└─expand|boolean|节点展开 前端所需|-
└─checked|boolean|是否勾选 前端所需|-
└─selected|boolean|是否选中 前端所需|-

**Response-example:**
```
{
  "id": "67",
  "createBy": "674xiz",
  "createTime": "2021-08-07 15:39:05",
  "updateBy": "juqe0l",
  "updateTime": "2021-08-07 15:39:05",
  "delFlag": 2,
  "username": "adam.gibson",
  "password": "bwaxov",
  "nickName": "shannon.williamson",
  "mobile": "(817) 227-6384",
  "email": "mirian.brekke@hotmail.com",
  "address": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "sex": 0,
  "avatar": "r655yd",
  "type": 632,
  "status": 834,
  "description": "l3vxcz",
  "roles": [
    {
      "id": "67",
      "createBy": "rv9xp7",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "tkff94",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "defaultRole": true,
      "permissions": [
        {
          "id": "67",
          "createBy": "ow7vvp",
          "createTime": "2021-08-07 15:39:05",
          "updateBy": "fnmxtm",
          "updateTime": "2021-08-07 15:39:05",
          "delFlag": 2,
          "name": "adam.gibson",
          "level": 269,
          "type": 122,
          "title": "xwojit",
          "path": "yfdvex",
          "component": "1rngt2",
          "icon": "xa2mj4",
          "buttonType": "vkhu49",
          "parentId": "67",
          "description": "4sm3m3",
          "sortOrder": 278,
          "status": 820,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "rz3fzi"
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
      "createBy": "of7m0z",
      "createTime": "2021-08-07 15:39:05",
      "updateBy": "uhhz0y",
      "updateTime": "2021-08-07 15:39:05",
      "delFlag": 2,
      "name": "adam.gibson",
      "level": 685,
      "type": 598,
      "title": "sffici",
      "path": "zvjpo8",
      "component": "kz26q8",
      "icon": "h0vphr",
      "buttonType": "zefy1d",
      "parentId": "67",
      "description": "bhd1qi",
      "sortOrder": 90,
      "status": 621,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "ttl8ld"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}
```

