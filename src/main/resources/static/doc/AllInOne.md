# Smart-doc测试样例


## apiNote注解测试
### 测试apiNote
**URL:** http://localhost:8080/test

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 用于测试apiNote注释是否有效

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
{
	"userDetails":[
		{
			"githubAddress":"龙侬003号， 上海， 京 076406"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.卢",
	"nickName":"barbara.stamm",
	"userAddress":"龙侬003号， 上海， 京 076406",
	"userAge":59,
	"phone":"15513642290",
	"createTime":1575727186545,
	"small":69.96,
	"money":51.53,
	"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
	"telephone":"15513642290"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
qmofnq
```

## app端接口测试
### app测试
**URL:** http://localhost:8080/app/test

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
http://localhost:8080/app/test?name=煜城.卢
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
vlcjz2
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://localhost:8080/testCallable

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/testCallable
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/async-deferredresult

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/async-deferredresult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"l6xdb0",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://localhost:8080/WebAsync/timeout

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/WebAsync/timeout
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/future

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/future
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"uz0vfn",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/completableFuture

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/completableFuture
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"bzadw2",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## 循环引用依赖测试
### 循环依赖参数推导
**URL:** http://localhost:8080/circularReference

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** 循环依赖参数推导(不建议使用)

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userName|string|用户名|false|-
roles|object|多对多<br>查询权限时使用，同一用户可同时拥有多个角色|false|-
└─id|string|角色编号|false|-
└─users|object|多对多<br>查询权限时使用，同一角色可能对应多个用户|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roles|object|多对多<br>查询权限时使用，同一用户可同时拥有多个角色|false|-

**Request-example:**
```
{
	"userName":"煜城.卢",
	"roles":[
		{
			"id":"34",
			"users":[
				{
					"userName":"煜城.卢",
					"roles":[
						{
							"$ref":"..."
						}
					]
				}
			]
		}
	]
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
jcgeyc
```

## 枚举参数测试
### 获取枚举参数
**URL:** http://localhost:8080/enum

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|true|-

**Request-example:**
```
http://localhost:8080/enum?simpleEnum=RED
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
l33o4t
```

### 获取枚举参数
**URL:** http://localhost:8080/enum/{simpleEnum}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|object|简单枚举|true|-

**Request-example:**
```
http://localhost:8080/enum/RED
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
qh7d3g
```

## 文件上传测试
### 上传单个文件
**URL:** http://localhost:8080/upload

**Type:** POST

**Content-Type:** multipart/form-data

**Description:** 上传单个文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|用户id|true|-
file|file|文件|true|-

**Request-example:**
```
Use FormData upload file.
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 批量上传文件
**URL:** http://localhost:8080/batchUpload

**Type:** POST

**Content-Type:** multipart/form-data

**Description:** 批量上传文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|array|文件|true|-

**Request-example:**
```
Use FormData upload files.
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## 接收表单参数
### 测试formData
**URL:** http://localhost:8080/formData1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
Smart-doc can't support create form-data example,
It is recommended to use @RequestBody to receive parameters.
```

**Response-example:**
```
This api return nothing.
```

## https测试
### 测试https
**URL:** http://localhost:8080/testHttps

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试https

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/testHttps
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"fsf9g5",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 测试http
**URL:** http://localhost:8080/testHttp

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试http

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/testHttp
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"1wl7f6",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://localhost:8080/inner/class

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Return A object contains Inner class

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/inner/class
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|姓名|-
innerClass|object|内部类|-
└─phone|string|电话|-

**Response-example:**
```
{
	"name":"煜城.卢",
	"innerClass":{
		"phone":"15513642290"
	}
}
```

## JDK8的时间测试
### LocalDate和LocalDateTime测试
**URL:** http://localhost:8080/dateEntity

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** LocalDate和LocalDateTime测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0

**Request-example:**
```
{
	"localDate":"2019-12-07",
	"localDateTime":"2019-12-07 21:59:46"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
localDate|string|创建日期|v1.0
localDateTime|string|创建时间|v1.0

**Response-example:**
```
{
	"localDate":"2019-12-07",
	"localDateTime":"2019-12-07 21:59:46"
}
```

## FastJson和Jackson注解支持测试
### Jackson注解支持测试
**URL:** http://localhost:8080/json/jacksonTest

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** Jackson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
{
	"username":"煜城.卢",
	"idCard":"531727197003241778"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"煜城.卢"
}
```

### FastJson注解支持测试
**URL:** http://localhost:8080/json/fastJsonTest

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** FastJson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
{
	"username":"煜城.卢",
	"idCard":"531727197003241778"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"煜城.卢"
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://localhost:8080/list/listString

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;String&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listString
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|array of string|The api directly returns the array of string type value.|-

**Response-example:**
```
[
	"uvstc9",
	"nxsvjz"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,String&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listMap
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
[
	{
		"mapKey1":"gqncr0",
		"mapKey2":"d3c76h"
	}
]
```

### List&lt;自动义对象&gt;
**URL:** http://localhost:8080/list/listObject

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;自动义对象&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listObject
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
userDetails|array|用户详情|-
└─githubAddress|string|测试|-
userList|array|用户列表|-
userName|string|用户名|-
nickName|string|昵称|-
userAddress|string|用户地址|-
userAge|int32|用户年龄|-
phone|string|手机号|-
createTime|int64|创建时间|-
small|float|钱少|-
money|double|钱太多了|-
ipv6|string|ipv6|-
telephone|string|固定电话|-

**Response-example:**
```
[
	{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":98.13,
		"money":82.71,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	}
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,T&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listMap2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
stuName|string|姓名|-
stuAge|boolean|年龄|-
stuAddress|string|地址|-
user|object|用户对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
userMap|map|map用户信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
userTreeSet|object|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
user1|object|用户对象2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-

**Response-example:**
```
[
	{
		"mapKey":{
			"stuName":"煜城.卢",
			"stuAge":true,
			"stuAddress":"龙侬003号， 上海， 京 076406",
			"user":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":52.49,
				"money":53.35,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":93.96,
					"money":27.24,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":73.92,
					"money":78.29,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":67.16,
				"money":89.99,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		}
	}
]
```

### List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listMap3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listMap3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
[
	{
		"mapKey":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":13.27,
				"money":75.57,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":13.11,
				"money":83.66,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":26.13,
				"money":74.04,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"age":59
		}
	}
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listTeacher

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listTeacher
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
[
	{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":69.17,
				"money":31.80,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":72.08,
				"money":47.22,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":75.70,
				"money":51.12,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"age":59
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://localhost:8080/list/listString1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listString1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
[
	{
		"data":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":80.09,
				"money":51.20,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":54.66,
				"money":33.28,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":91.85,
				"money":51.65,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"age":59
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":25.06,
			"money":46.51,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":91.54,
			"money":62.70,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"age":59
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://localhost:8080/list/listString2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listString2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data1|object|泛型data1|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data2|object|data2|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
age|int32|年龄|-

**Response-example:**
```
[
	{
		"data":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":19.16,
				"money":54.26,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":70.80,
				"money":4.86,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":24.40,
				"money":66.04,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"age":59
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":83.47,
				"money":64.90,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":51.97,
				"money":93.80,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":16.64,
				"money":6.71,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"age":59
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":25.00,
				"money":85.97,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":41.18,
				"money":38.71,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":86.84,
				"money":51.08,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"age":59
		},
		"age":59
	}
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://localhost:8080/list/listUserDto

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;List&lt;UserDto&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/list/listUserDto
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─token|string|token|-
└─LoginList|array|UserDto 用户信息列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":[
		{
			"token":"dgfdg0",
			"LoginList":[
				{
					"userName":"煜城.卢",
					"password":"bws3t4"
				}
			]
		}
	],
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://localhost:8080/map/primitive

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Integer&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/primitive
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|key value|The api directly returns the key value type value.|-

**Response-example:**
```
{
	"mapKey1":986,
	"mapKey2":580
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://localhost:8080/map/objectValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Object&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/objectValue
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{
	"mapKey":{
		"waring":"You may use java.util.Object for Map value; smart-doc can't be handle."
	}
}
```

### Map&lt;String,User&gt;结构
**URL:** http://localhost:8080/map/object

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,User&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/object
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
userDetails|array|用户详情|-
└─githubAddress|string|测试|-
userList|array|用户列表|-
userName|string|用户名|-
nickName|string|昵称|-
userAddress|string|用户地址|-
userAge|int32|用户年龄|-
phone|string|手机号|-
createTime|int64|创建时间|-
small|float|钱少|-
money|double|钱太多了|-
ipv6|string|ipv6|-
telephone|string|固定电话|-

**Response-example:**
```
{
	"mapKey":{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":60.11,
		"money":91.50,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	}
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://localhost:8080/map/test1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Student&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/test1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
stuName|string|姓名|-
stuAge|boolean|年龄|-
stuAddress|string|地址|-
user|object|用户对象|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userMap|map|map用户信息|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userTreeSet|object|用户列表|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
user1|object|用户对象2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-

**Response-example:**
```
{
	"mapKey":{
		"stuName":"煜城.卢",
		"stuAge":true,
		"stuAddress":"龙侬003号， 上海， 京 076406",
		"user":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":73.50,
			"money":91.58,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":13.80,
				"money":24.56,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":14.59,
				"money":78.34,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":40.80,
			"money":76.93,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		}
	}
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─stuName|string|姓名|-
└─stuAge|boolean|年龄|-
└─stuAddress|string|地址|-
└─user|object|用户对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userMap|map|map用户信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userTreeSet|object|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─user1|object|用户对象2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
{
	"mapKey":{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":21.25,
				"money":60.78,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":79.87,
			"money":40.26,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"stuName":"煜城.卢",
			"stuAge":true,
			"stuAddress":"龙侬003号， 上海， 京 076406",
			"user":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":42.53,
				"money":72.05,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":34.23,
					"money":39.91,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":92.74,
					"money":21.43,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":6.15,
				"money":29.53,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"age":59
	}
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/test3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─stuName|string|姓名|-
└─stuAge|boolean|年龄|-
└─stuAddress|string|地址|-
└─user|object|用户对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userMap|map|map用户信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userTreeSet|object|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─user1|object|用户对象2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
{
	"mapKey":{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":92.18,
				"money":38.11,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":14.32,
			"money":39.14,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"stuName":"煜城.卢",
			"stuAge":true,
			"stuAddress":"龙侬003号， 上海， 京 076406",
			"user":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":22.06,
				"money":55.67,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":90.05,
					"money":21.68,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"龙侬003号， 上海， 京 076406"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.卢",
					"nickName":"barbara.stamm",
					"userAddress":"龙侬003号， 上海， 京 076406",
					"userAge":59,
					"phone":"15513642290",
					"createTime":1575727186545,
					"small":51.31,
					"money":72.21,
					"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
					"telephone":"15513642290"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":93.77,
				"money":2.02,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"age":59
	}
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/map/test4
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
{
	"mapKey":{
		"data":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":46.20,
				"money":0.65,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":80.13,
				"money":57.18,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":18.03,
				"money":18.55,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"age":59
	}
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://localhost:8080/testRequestHeader

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader常规使用

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-
name|string|请求头(name)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader?age=59
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定参数名
**URL:** http://localhost:8080/testRequestHeader/value

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定参数名

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-
age|int32|  年龄|true|-


**Request-example:**
```
http://localhost:8080/testRequestHeader/value
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定默认值
**URL:** http://localhost:8080/testRequestHeader/DefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定默认值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader/DefaultVal?age=59
```

**Response-example:**
```
This api return nothing.
```

## Spring boot params test
### Test Normal param binding
**URL:** http://localhost:8080/testNormalParams/binding

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Normal param binding

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|true|-

**Request-example:**
```
http://localhost:8080/testNormalParams/binding?name=煜城.卢&age=59
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody User
**URL:** http://localhost:8080/testRequestBody

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody User

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
{
	"userDetails":[
		{
			"githubAddress":"龙侬003号， 上海， 京 076406"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.卢",
	"nickName":"barbara.stamm",
	"userAddress":"龙侬003号， 上海， 京 076406",
	"userAge":59,
	"phone":"15513642290",
	"createTime":1575727186545,
	"small":66.76,
	"money":46.75,
	"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
	"telephone":"15513642290"
}
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody Map
**URL:** http://localhost:8080/testRequestBodyMap

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody Map

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
{
	"mapKey":{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":99.35,
		"money":37.55,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	}
}
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody List
**URL:** http://localhost:8080/testRequestBodyList

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id|true|-

**Request-example:**
```
[
	"isk5vm",
	"xwk3m1"
]
```

**Response-example:**
```
This api return nothing.
```

### Test @PathVariable
**URL:** http://localhost:8080/test/{name}/{no}/info

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @PathVariable

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
http://localhost:8080/test/煜城.卢/iatprc/info
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam
**URL:** http://localhost:8080/testRequestParam

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @RequestParam

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|  type|true|-

**Request-example:**
```
http://localhost:8080/testRequestParam?author=黄瑾瑜&type=5n2gbm
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with value
**URL:** http://localhost:8080/testRequestParamWithValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding value is name,but method param name is userName

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
http://localhost:8080/testRequestParamWithValue?name=煜城.卢
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with default value
**URL:** http://localhost:8080/testRequestParamWithDefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding default value Jordan

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userName|string|user name|true|-

**Request-example:**
```
http://localhost:8080/testRequestParamWithDefaultVal?userName=Jordan
```

**Response-example:**
```
This api return nothing.
```

### Test much path
**URL:** http://localhost:8080/testMuchPath/get/{userId};	http://localhost:8080/testMuchPath/find/{userId}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** giteeissues #I1545A

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
http://localhost:8080/testMuchPath/get/769;	http://localhost:8080/testMuchPath/find/769
```

**Response-example:**
```
This api return nothing.
```

### Test much path much parameter
**URL:** http://localhost:8080/get/{deptId}/{userId};	http://localhost:8080/find/{deptId}/{userId}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test much path much parameter

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-
deptId|int64|deptId|true|-

**Request-example:**
```
http://localhost:8080/get/882/773;	http://localhost:8080/find/882/773
```

**Response-example:**
```
This api return nothing.
```

## Test ResponseEntity
### ResponseEntity return List
**URL:** http://localhost:8080/responseEntity/list

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** ResponseEntity return List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/responseEntity/list
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
userDetails|array|用户详情|-
└─githubAddress|string|测试|-
userList|array|用户列表|-
userName|string|用户名|-
nickName|string|昵称|-
userAddress|string|用户地址|-
userAge|int32|用户年龄|-
phone|string|手机号|-
createTime|int64|创建时间|-
small|float|钱少|-
money|double|钱太多了|-
ipv6|string|ipv6|-
telephone|string|固定电话|-

**Response-example:**
```
[
	{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":75.05,
		"money":19.83,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	}
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://localhost:8080/simple/str

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回普通String测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/str
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
6ttnie
```

### 返回普通javabean
**URL:** http://localhost:8080/simple/user

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 返回普通javabean

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
{
	"userDetails":[
		{
			"githubAddress":"龙侬003号， 上海， 京 076406"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.卢",
	"nickName":"barbara.stamm",
	"userAddress":"龙侬003号， 上海， 京 076406",
	"userAge":59,
	"phone":"15513642290",
	"createTime":1575727186545,
	"small":91.92,
	"money":49.10,
	"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
	"telephone":"15513642290"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
userDetails|array|用户详情|-
└─githubAddress|string|测试|-
userList|array|用户列表|-
userName|string|用户名|-
nickName|string|昵称|-
userAddress|string|用户地址|-
userAge|int32|用户年龄|-
phone|string|手机号|-
createTime|int64|创建时间|-
small|float|钱少|-
money|double|钱太多了|-
ipv6|string|ipv6|-
telephone|string|固定电话|-

**Response-example:**
```
{
	"userDetails":[
		{
			"githubAddress":"龙侬003号， 上海， 京 076406"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.卢",
	"nickName":"barbara.stamm",
	"userAddress":"龙侬003号， 上海， 京 076406",
	"userAge":59,
	"phone":"15513642290",
	"createTime":1575727186545,
	"small":84.49,
	"money":88.29,
	"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
	"telephone":"15513642290"
}
```

### 返回复杂实体数据
**URL:** http://localhost:8080/simple/stu

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回复杂实体数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/stu
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
stuName|string|姓名|-
stuAge|boolean|年龄|-
stuAddress|string|地址|-
user|object|用户对象|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userMap|map|map用户信息|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userTreeSet|object|用户列表|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
user1|object|用户对象2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-

**Response-example:**
```
{
	"stuName":"煜城.卢",
	"stuAge":true,
	"stuAddress":"龙侬003号， 上海， 京 076406",
	"user":{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":56.78,
		"money":15.09,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	},
	"userMap":{
		"mapKey":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":99.90,
			"money":8.70,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":76.65,
			"money":85.19,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":28.51,
		"money":63.22,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	}
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://localhost:8080/simple/teacher

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/teacher
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data1|object|泛型data1|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data2|object|data2|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
age|int32|年龄|-

**Response-example:**
```
{
	"data":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":15.20,
			"money":15.36,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":56.93,
			"money":64.04,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":79.01,
			"money":37.21,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"age":59
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":86.87,
			"money":7.16,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":33.76,
			"money":15.52,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":64.98,
			"money":91.75,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"age":59
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":17.58,
			"money":21.99,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":32.56,
			"money":29.13,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":61.54,
			"money":4.68,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"age":59
	},
	"age":59
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://localhost:8080/simple/teacher2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;List&lt;User&gt;, User, Student&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/teacher2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data2|object|data2|-
└─stuName|string|姓名|-
└─stuAge|boolean|年龄|-
└─stuAddress|string|地址|-
└─user|object|用户对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userMap|map|map用户信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userTreeSet|object|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─user1|object|用户对象2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
{
	"data":[
		{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":59.68,
			"money":52.01,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		}
	],
	"data1":{
		"userDetails":[
			{
				"githubAddress":"龙侬003号， 上海， 京 076406"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.卢",
		"nickName":"barbara.stamm",
		"userAddress":"龙侬003号， 上海， 京 076406",
		"userAge":59,
		"phone":"15513642290",
		"createTime":1575727186545,
		"small":93.34,
		"money":83.29,
		"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
		"telephone":"15513642290"
	},
	"data2":{
		"stuName":"煜城.卢",
		"stuAge":true,
		"stuAddress":"龙侬003号， 上海， 京 076406",
		"user":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":20.41,
			"money":74.65,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":43.57,
				"money":54.59,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"龙侬003号， 上海， 京 076406"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.卢",
				"nickName":"barbara.stamm",
				"userAddress":"龙侬003号， 上海， 京 076406",
				"userAge":59,
				"phone":"15513642290",
				"createTime":1575727186545,
				"small":86.32,
				"money":47.51,
				"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
				"telephone":"15513642290"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"龙侬003号， 上海， 京 076406"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.卢",
			"nickName":"barbara.stamm",
			"userAddress":"龙侬003号， 上海， 京 076406",
			"userAge":59,
			"phone":"15513642290",
			"createTime":1575727186545,
			"small":96.40,
			"money":49.21,
			"ipv6":"15b4:33a9:33d1:6ae4:1c7d:627c:b2f3:65c0",
			"telephone":"15513642290"
		}
	},
	"age":59
}
```

### 测试SubUser
**URL:** http://localhost:8080/simple/subUser

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试SubUser

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/subUser
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
subUserName|string|用户名称|-
numbers|number|bigInteger|-

**Response-example:**
```
{
	"subUserName":"煜城.卢",
	"numbers":566
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://localhost:8080/simple/subUser/result

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CommonResult&lt;SubUser&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/simple/subUser/result
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"subUserName":"煜城.卢",
		"numbers":365
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://localhost:8080/stringCommonResult

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/stringCommonResult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"ewbleq",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://localhost:8080/staff

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/staff
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-
data|array|泛型数据|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-

**Response-example:**
```
{
	"name":"煜城.卢",
	"annyObject":{
		"name":"煜城.卢",
		"annyObject":{
			"$ref":"..."
		},
		"data":[
			{
				"$ref":".."
			}
		]
	},
	"data":[
		{
			"name":"煜城.卢",
			"annyObject":{
				"$ref":"..."
			},
			"data":[
				{
					"$ref":".."
				}
			]
		}
	]
}
```

### 返回Staff&lt;String&gt;
**URL:** http://localhost:8080/staffStr

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/staffStr
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
data|array|泛型数据|-

**Response-example:**
```
{
	"name":"煜城.卢",
	"annyObject":"1j3rji",
	"data":[
		"x4frax"
	]
}
```

### JAVA继承测试
**URL:** http://localhost:8080/children

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** JAVA继承测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
{
	"name":"煜城.卢",
	"age":59
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|姓名|-
age|int32|年龄|-

**Response-example:**
```
{
	"name":"煜城.卢",
	"age":59
}
```

## 用户信息操作接口
### 添加用户
**URL:** http://localhost:8080/user/add

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
{
	"simpleEnum":"RED",
	"username":"煜城.卢",
	"password":"3mld13",
	"nickName":"barbara.stamm",
	"mobile":"17650048171",
	"gender":0
}
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
	"id":"34",
	"createBy":"gajla7",
	"createTime":"2019-12-07",
	"updateBy":"lq6ylb",
	"updateTime":"2019-12-07",
	"delFlag":5,
	"username":"煜城.卢",
	"password":"85ugtk",
	"nickName":"barbara.stamm",
	"mobile":"17650048171",
	"email":"越彬.蔡@gmail.com",
	"address":"龙侬003号， 上海， 京 076406",
	"sex":1,
	"avatar":"mcf6q3",
	"type":776,
	"status":688,
	"description":"59a1kh",
	"roles":[
		{
			"id":"34",
			"createBy":"2t5q7c",
			"createTime":"2019-12-07",
			"updateBy":"su7bn8",
			"updateTime":"2019-12-07",
			"delFlag":5,
			"name":"煜城.卢",
			"defaultRole":true,
			"permissions":[
				{
					"id":"34",
					"createBy":"gyt0tn",
					"createTime":"2019-12-07",
					"updateBy":"hjvn1n",
					"updateTime":"2019-12-07",
					"delFlag":5,
					"name":"煜城.卢",
					"level":904,
					"type":603,
					"title":"b2q1tn",
					"path":"u7pnvm",
					"component":"k7m07i",
					"icon":"qq4t02",
					"buttonType":"f2l057",
					"parentId":"34",
					"description":"hlah65",
					"sortOrder":373,
					"status":943,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"lwby9e"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"34",
			"createBy":"nam19r",
			"createTime":"2019-12-07",
			"updateBy":"dweyhx",
			"updateTime":"2019-12-07",
			"delFlag":5,
			"name":"煜城.卢",
			"level":295,
			"type":868,
			"title":"7n46z7",
			"path":"taalq4",
			"component":"1o65c6",
			"icon":"wekd2c",
			"buttonType":"2cfocm",
			"parentId":"34",
			"description":"aobens",
			"sortOrder":915,
			"status":300,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"x4yaeg"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}
```

### 更新用户
**URL:** http://localhost:8080/user/update

**Type:** PUT

**Content-Type:** application/json; charset=utf-8

**Description:** 更新用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
{
	"simpleEnum":"RED",
	"username":"煜城.卢",
	"password":"peiizo",
	"nickName":"barbara.stamm",
	"mobile":"17650048171",
	"gender":0
}
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
	"id":"34",
	"createBy":"qfqpu9",
	"createTime":"2019-12-07",
	"updateBy":"xyb9qj",
	"updateTime":"2019-12-07",
	"delFlag":5,
	"username":"煜城.卢",
	"password":"ni3rm2",
	"nickName":"barbara.stamm",
	"mobile":"17650048171",
	"email":"越彬.蔡@gmail.com",
	"address":"龙侬003号， 上海， 京 076406",
	"sex":1,
	"avatar":"1g91xy",
	"type":521,
	"status":249,
	"description":"hfwm3v",
	"roles":[
		{
			"id":"34",
			"createBy":"3mmx4a",
			"createTime":"2019-12-07",
			"updateBy":"mqupug",
			"updateTime":"2019-12-07",
			"delFlag":5,
			"name":"煜城.卢",
			"defaultRole":true,
			"permissions":[
				{
					"id":"34",
					"createBy":"j9loe3",
					"createTime":"2019-12-07",
					"updateBy":"evev93",
					"updateTime":"2019-12-07",
					"delFlag":5,
					"name":"煜城.卢",
					"level":183,
					"type":565,
					"title":"968psb",
					"path":"imkwdr",
					"component":"90oeof",
					"icon":"bth45z",
					"buttonType":"9j8ogw",
					"parentId":"34",
					"description":"o8q4tz",
					"sortOrder":543,
					"status":554,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"jcq34k"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"34",
			"createBy":"plxq0q",
			"createTime":"2019-12-07",
			"updateBy":"u65ns7",
			"updateTime":"2019-12-07",
			"delFlag":5,
			"name":"煜城.卢",
			"level":114,
			"type":955,
			"title":"y2vlkx",
			"path":"bpk4g2",
			"component":"afehep",
			"icon":"43597t",
			"buttonType":"p87u8j",
			"parentId":"34",
			"description":"1l8atm",
			"sortOrder":695,
			"status":492,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"9sw0jx"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}
```

## JSR303参数验证规范测试
### 验证validate
**URL:** http://localhost:8080/validator/test

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 验证validate

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-

**Request-example:**
```
{
	"name":"煜城.卢",
	"birthday":"2019-12-07",
	"age":59,
	"subject":{
		"subjectName":"煜城.卢"
	}
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### 验证通用参数
**URL:** http://localhost:8080/validator/valid

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 验证通用参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
token|string|token|true|-
sequenceNo|string|序列号|true|-
parameter|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-

**Request-example:**
```
{
	"token":"vwj8y1",
	"sequenceNo":"0o42s1",
	"parameter":{
		"subUserName":"煜城.卢",
		"numbers":678
	}
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

## xss拦击测试
### xss过滤普通post请求
**URL:** http://localhost:8080/xss/text

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤普通post请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|true|-

**Request-example:**
```
{
	"text":"64n7hv"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"rr88cj",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### xss过滤get请求
**URL:** http://localhost:8080/xss/query

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤get请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|true|-

**Request-example:**
```
http://localhost:8080/xss/query?query=cuz6un
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"u2m9xg",
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

### xss过滤json数据
**URL:** http://localhost:8080/xss/json

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤json数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
{
	"name":"煜城.卢",
	"age":59
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─name|string|姓名|-
└─age|int32|年龄|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"name":"煜城.卢",
		"age":59
	},
	"code":"88541",
	"timestamp":"2019-12-07 21:59:46"
}
```

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
