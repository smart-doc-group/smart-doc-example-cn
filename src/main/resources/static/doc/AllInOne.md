# 测试


## apiNote注解测试
### 测试apiNote
**URL:** http://localhost:8080/test

**Type:** GET

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
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
{
	"username":"煜城.丁",
	"password":"1cxxrl",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"gender":2
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
username|string|用户名|v1.0
password|string|密码|v1.0
nickName|string|昵称|v1.0
mobile|string|电话|v1.0
gender|object|性别(See: 性别数据字典)|-

**Response-example:**
```
{
	"username":"煜城.丁",
	"password":"xah2po",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"gender":{
		"name":"煜城.丁",
		"ordinal":256,
		"WOMAN":{
			"$ref":"..."
		},
		"MAN":{
			"$ref":"..."
		},
		"code":593,
		"desc":"txkgv1"
	}
}
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
http://localhost:8080/app/test?name=煜城.丁
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
na864z
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://localhost:8080/  /testCallable

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
http://localhost:8080/  /testCallable
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"zmje11",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"qhpkh7",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"i84ykx",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"userName":"煜城.丁",
	"roles":[
		{
			"id":"136",
			"users":[
				{
					"userName":"煜城.丁",
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
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
klcvm8
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"ta558e",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"vfjxba",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"name":"煜城.丁",
	"innerClass":{
		"phone":"18076612577"
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
	"localDate":"2019-11-14",
	"localDateTime":"2019-11-14 22:06:02"
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
	"localDate":"2019-11-14",
	"localDateTime":"2019-11-14 22:06:02"
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
	"username":"煜城.丁",
	"idCard":"511712199003036002"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"煜城.丁"
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
	"username":"煜城.丁",
	"idCard":"511712199003036002"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"煜城.丁"
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
no param name|array of string|The api directly returns the array of string type value.|-

**Response-example:**
```
[
	"qxadeg",
	"pkrr72"
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
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
[
	{
		"mapKey1":"2r8kl6",
		"mapKey2":"mlz5n9"
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
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":33.32,
		"money":92.26,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
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
			"stuName":"煜城.丁",
			"stuAge":true,
			"stuAddress":"萧路031号， 张家口， 甘 453118",
			"user":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":5.06,
				"money":72.05,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"萧路031号， 张家口， 甘 453118"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.丁",
					"nickName":"leroy.nicolas",
					"userAddress":"萧路031号， 张家口， 甘 453118",
					"userAge":8,
					"phone":"18076612577",
					"createTime":1573740361961,
					"small":77.66,
					"money":77.46,
					"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
					"telephone":"18076612577"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":11.56,
				"money":21.37,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":65.89,
				"money":79.67,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":13.21,
				"money":82.88,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":51.82,
				"money":20.51,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"age":8
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":42.80,
				"money":42.87,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":49.26,
				"money":53.97,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":14.38,
				"money":83.79,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"age":8
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":30.29,
				"money":68.61,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":73.26,
				"money":32.87,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":0.57,
				"money":80.23,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"age":8
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":63.12,
			"money":60.52,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":13.93,
			"money":72.21,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"age":8
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":19.93,
				"money":99.38,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":81.14,
				"money":21.95,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":52.87,
				"money":6.07,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"age":8
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":60.93,
				"money":98.19,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":13.53,
				"money":54.85,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":95.46,
				"money":26.32,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"age":8
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":86.46,
				"money":34.53,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":66.88,
				"money":96.66,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":56.51,
				"money":18.45,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"age":8
		},
		"age":8
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
			"token":"wzqp6l",
			"LoginList":[
				{
					"userName":"煜城.丁",
					"password":"i1jvix"
				}
			]
		}
	],
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
no param name|key value|The api directly returns the key value type value.|-

**Response-example:**
```
{
	"mapKey1":814,
	"mapKey2":942
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
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":43.44,
		"money":49.17,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
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
		"stuName":"煜城.丁",
		"stuAge":true,
		"stuAddress":"萧路031号， 张家口， 甘 453118",
		"user":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":21.37,
			"money":51.22,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":97.02,
				"money":35.36,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":14.86,
			"money":10.73,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":71.80,
				"money":42.06,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":9.19,
			"money":10.29,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"stuName":"煜城.丁",
			"stuAge":true,
			"stuAddress":"萧路031号， 张家口， 甘 453118",
			"user":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":96.03,
				"money":51.78,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"萧路031号， 张家口， 甘 453118"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.丁",
					"nickName":"leroy.nicolas",
					"userAddress":"萧路031号， 张家口， 甘 453118",
					"userAge":8,
					"phone":"18076612577",
					"createTime":1573740361961,
					"small":32.73,
					"money":35.20,
					"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
					"telephone":"18076612577"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":42.83,
				"money":35.72,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		},
		"age":8
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":94.73,
				"money":11.25,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":88.19,
			"money":90.62,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"stuName":"煜城.丁",
			"stuAge":true,
			"stuAddress":"萧路031号， 张家口， 甘 453118",
			"user":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":30.06,
				"money":70.78,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"萧路031号， 张家口， 甘 453118"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"煜城.丁",
					"nickName":"leroy.nicolas",
					"userAddress":"萧路031号， 张家口， 甘 453118",
					"userAge":8,
					"phone":"18076612577",
					"createTime":1573740361961,
					"small":7.86,
					"money":44.40,
					"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
					"telephone":"18076612577"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":91.66,
				"money":53.69,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		},
		"age":8
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
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":69.12,
				"money":87.28,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":53.32,
				"money":6.75,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":27.93,
				"money":46.12,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		},
		"age":8
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
http://localhost:8080/testRequestHeader?age=8
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
http://localhost:8080/testRequestHeader/DefaultVal?age=8
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
http://localhost:8080/testNormalParams/binding?name=煜城.丁&age=8
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
			"githubAddress":"萧路031号， 张家口， 甘 453118"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.丁",
	"nickName":"leroy.nicolas",
	"userAddress":"萧路031号， 张家口， 甘 453118",
	"userAge":8,
	"phone":"18076612577",
	"createTime":1573740361961,
	"small":85.24,
	"money":64.00,
	"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
	"telephone":"18076612577"
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
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":12.06,
		"money":22.17,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
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
	"hmp832",
	"t95dlb"
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
http://localhost:8080/test/煜城.丁/ouz45k/info
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
type|string|type|true|-

**Request-example:**
```
http://localhost:8080/testRequestParam?author=崔文昊&type=ypx240
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
http://localhost:8080/testRequestParamWithValue?name=煜城.丁
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
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":92.25,
		"money":3.98,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
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
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
p9r1bs
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
			"githubAddress":"萧路031号， 张家口， 甘 453118"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.丁",
	"nickName":"leroy.nicolas",
	"userAddress":"萧路031号， 张家口， 甘 453118",
	"userAge":8,
	"phone":"18076612577",
	"createTime":1573740361961,
	"small":43.73,
	"money":44.22,
	"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
	"telephone":"18076612577"
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
			"githubAddress":"萧路031号， 张家口， 甘 453118"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"煜城.丁",
	"nickName":"leroy.nicolas",
	"userAddress":"萧路031号， 张家口， 甘 453118",
	"userAge":8,
	"phone":"18076612577",
	"createTime":1573740361961,
	"small":29.88,
	"money":87.75,
	"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
	"telephone":"18076612577"
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
	"stuName":"煜城.丁",
	"stuAge":true,
	"stuAddress":"萧路031号， 张家口， 甘 453118",
	"user":{
		"userDetails":[
			{
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":23.31,
		"money":91.19,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
	},
	"userMap":{
		"mapKey":{
			
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":68.24,
			"money":54.55,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":25.52,
		"money":18.68,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
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
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":37.27,
			"money":44.35,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":21.94,
			"money":79.85,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":32.14,
			"money":26.54,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"age":8
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":35.66,
			"money":72.69,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":13.43,
			"money":1.18,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":7.09,
			"money":88.16,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"age":8
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":76.85,
			"money":93.82,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":38.52,
			"money":20.13,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":60.52,
			"money":35.56,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"age":8
	},
	"age":8
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
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":99.71,
			"money":76.78,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		}
	],
	"data1":{
		"userDetails":[
			{
				"githubAddress":"萧路031号， 张家口， 甘 453118"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"煜城.丁",
		"nickName":"leroy.nicolas",
		"userAddress":"萧路031号， 张家口， 甘 453118",
		"userAge":8,
		"phone":"18076612577",
		"createTime":1573740361961,
		"small":3.21,
		"money":58.65,
		"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
		"telephone":"18076612577"
	},
	"data2":{
		"stuName":"煜城.丁",
		"stuAge":true,
		"stuAddress":"萧路031号， 张家口， 甘 453118",
		"user":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":73.98,
			"money":6.01,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"萧路031号， 张家口， 甘 453118"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"煜城.丁",
				"nickName":"leroy.nicolas",
				"userAddress":"萧路031号， 张家口， 甘 453118",
				"userAge":8,
				"phone":"18076612577",
				"createTime":1573740361961,
				"small":97.03,
				"money":56.47,
				"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
				"telephone":"18076612577"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"萧路031号， 张家口， 甘 453118"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"煜城.丁",
			"nickName":"leroy.nicolas",
			"userAddress":"萧路031号， 张家口， 甘 453118",
			"userAge":8,
			"phone":"18076612577",
			"createTime":1573740361961,
			"small":12.61,
			"money":36.21,
			"ipv6":"97f0:f74e:56de:4087:fcd9:60ac:0aa9:4f04",
			"telephone":"18076612577"
		}
	},
	"age":8
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
	"subUserName":"煜城.丁",
	"numbers":630
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
		"subUserName":"煜城.丁",
		"numbers":851
	},
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"data":"vli68z",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"name":"煜城.丁",
	"annyObject":{
		"name":"煜城.丁",
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
			"name":"煜城.丁",
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
	"name":"煜城.丁",
	"annyObject":"00o6m1",
	"data":[
		"4abfki"
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
	"name":"煜城.丁",
	"age":8
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
	"name":"煜城.丁",
	"age":8
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
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
{
	"username":"煜城.丁",
	"password":"g41ph0",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"gender":2
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
	"id":"136",
	"createBy":"sja6wf",
	"createTime":2019-11-14,
	"updateBy":"sa5xik",
	"updateTime":2019-11-14,
	"delFlag":4,
	"username":"煜城.丁",
	"password":"xu720t",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"email":"浩然.何@hotmail.com",
	"address":"萧路031号， 张家口， 甘 453118",
	"sex":0,
	"avatar":"9sd5kp",
	"type":569,
	"status":835,
	"description":"mrmhvw",
	"roles":[
		{
			"id":"136",
			"createBy":"wayfst",
			"createTime":2019-11-14,
			"updateBy":"3mqwjy",
			"updateTime":2019-11-14,
			"delFlag":4,
			"name":"煜城.丁",
			"defaultRole":true,
			"permissions":[
				{
					"id":"136",
					"createBy":"flepk5",
					"createTime":2019-11-14,
					"updateBy":"vpsabl",
					"updateTime":2019-11-14,
					"delFlag":4,
					"name":"煜城.丁",
					"level":658,
					"type":164,
					"title":"797n8z",
					"path":"6nf9wt",
					"component":"lvbne0",
					"icon":"4btq91",
					"buttonType":"3b6u6f",
					"parentId":"136",
					"description":"2cp9ka",
					"sortOrder":761,
					"status":743,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"ifgdhr"
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
			"id":"136",
			"createBy":"377duw",
			"createTime":2019-11-14,
			"updateBy":"u94rit",
			"updateTime":2019-11-14,
			"delFlag":4,
			"name":"煜城.丁",
			"level":272,
			"type":77,
			"title":"n82ohv",
			"path":"5gh0w7",
			"component":"ltexv5",
			"icon":"j02agn",
			"buttonType":"bngp06",
			"parentId":"136",
			"description":"ctnfkm",
			"sortOrder":380,
			"status":589,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"66abfr"
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
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
{
	"username":"煜城.丁",
	"password":"axk9ed",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"gender":2
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
	"id":"136",
	"createBy":"zll2cs",
	"createTime":2019-11-14,
	"updateBy":"t975y3",
	"updateTime":2019-11-14,
	"delFlag":4,
	"username":"煜城.丁",
	"password":"0o2ivy",
	"nickName":"leroy.nicolas",
	"mobile":"17538627282",
	"email":"浩然.何@hotmail.com",
	"address":"萧路031号， 张家口， 甘 453118",
	"sex":0,
	"avatar":"gt6in4",
	"type":734,
	"status":760,
	"description":"qs78uc",
	"roles":[
		{
			"id":"136",
			"createBy":"my8qy8",
			"createTime":2019-11-14,
			"updateBy":"9ujt84",
			"updateTime":2019-11-14,
			"delFlag":4,
			"name":"煜城.丁",
			"defaultRole":true,
			"permissions":[
				{
					"id":"136",
					"createBy":"740yjc",
					"createTime":2019-11-14,
					"updateBy":"zfe4nv",
					"updateTime":2019-11-14,
					"delFlag":4,
					"name":"煜城.丁",
					"level":729,
					"type":655,
					"title":"4knr3q",
					"path":"wiip1i",
					"component":"fvzajh",
					"icon":"lahm4k",
					"buttonType":"4g9hg7",
					"parentId":"136",
					"description":"puogw9",
					"sortOrder":746,
					"status":377,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"tvvva3"
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
			"id":"136",
			"createBy":"f4v1an",
			"createTime":2019-11-14,
			"updateBy":"hq0023",
			"updateTime":2019-11-14,
			"delFlag":4,
			"name":"煜城.丁",
			"level":133,
			"type":859,
			"title":"olcm5r",
			"path":"jph7nm",
			"component":"yczlki",
			"icon":"p1foit",
			"buttonType":"4v7yqn",
			"parentId":"136",
			"description":"ron7h2",
			"sortOrder":952,
			"status":620,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"0dztet"
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
	"name":"煜城.丁",
	"birthday":"2019-11-14",
	"age":8,
	"subject":{
		"subjectName":"煜城.丁"
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"token":"xlny8t",
	"sequenceNo":"d5kpa4",
	"parameter":{
		"subUserName":"煜城.丁",
		"numbers":388
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
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"text":"tcueps"
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
	"data":"kl05o6",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
http://localhost:8080/xss/query?query=dkzpyf
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
	"data":"agq366",
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
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
	"name":"煜城.丁",
	"age":8
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
		"name":"煜城.丁",
		"age":8
	},
	"code":"17289",
	"timestamp":"2019-11-14 22:06:01"
}
```


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
