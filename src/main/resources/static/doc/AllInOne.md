# 测试


## apiNote注解测试
### 测试apiNote
**URL:** http://localhost:8080/test

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** 用于测试apiNote注释是否有效

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
			"githubAddress":"郑街197号， 盐城， 京 711291"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"鹏煊.朱",
	"nickName":"gayle.quigley",
	"userAddress":"郑街197号， 盐城， 京 711291",
	"userAge":37,
	"phone":"15392341080",
	"createTime":1573029211927,
	"small":89.14,
	"money":78.89,
	"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
	"telephone":"15392341080"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
g5zqiy
```

## app端接口测试
### app测试
**URL:** http://localhost:8080/app/test

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
http://localhost:8080/app/test?name=鹏煊.朱
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
w1h422
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://localhost:8080/  /testCallable

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-example:**
```
http://localhost:8080/  /testCallable
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/async-deferredresult

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
http://localhost:8080/async-deferredresult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"9bczq9",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://localhost:8080/WebAsync/timeout

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;

**Request-example:**
```
http://localhost:8080/WebAsync/timeout
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/future

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
http://localhost:8080/future
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"p756y9",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/completableFuture

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
http://localhost:8080/completableFuture
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"wc917g",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## 文件上传测试
### 上传单个文件
**URL:** http://localhost:8080/upload

**Type:** POST

**Content-Type:** multipart/form-data

**Description:** 上传单个文件

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
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 批量上传文件
**URL:** http://localhost:8080/batchUpload

**Type:** POST

**Content-Type:** multipart/form-data

**Description:** 批量上传文件

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
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## 接收表单参数
### 测试formData
**URL:** http://localhost:8080/formData1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0

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

**Request-example:**
```
http://localhost:8080/testHttps
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"167cbm",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 测试http
**URL:** http://localhost:8080/testHttp

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试http

**Request-example:**
```
http://localhost:8080/testHttp
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"hqjlu7",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://localhost:8080/inner/class

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Return A object contains Inner class

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
	"name":"鹏煊.朱",
	"innerClass":{
		"phone":"15392341080"
	}
}
```

## JDK8的时间测试
### LocalDate和LocalDateTime测试
**URL:** http://localhost:8080/dateEntity

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** LocalDate和LocalDateTime测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0

**Request-example:**
```
{
	"localDate":"2019-11-06",
	"localDateTime":"2019-11-06 16:33:32"
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
	"localDate":"2019-11-06",
	"localDateTime":"2019-11-06 16:33:32"
}
```

## FastJson和Jackson注解支持测试
### Jackson注解支持测试
**URL:** http://localhost:8080/json/jacksonTest

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** Jackson注解支持测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
{
	"username":"鹏煊.朱",
	"idCard":"460404197312222233"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"鹏煊.朱"
}
```

### FastJson注解支持测试
**URL:** http://localhost:8080/json/fastJsonTest

**Type:** GET

**Content-Type:** application/json; charset=utf-8

**Description:** FastJson注解支持测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
{
	"username":"鹏煊.朱",
	"idCard":"460404197312222233"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"鹏煊.朱"
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://localhost:8080/list/listString

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;String&gt;结构

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
	"wsiq0v",
	"zcjj2j"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,String&gt;&gt;结构

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
		"mapKey1":"beubbo",
		"mapKey2":"ppquns"
	}
]
```

### List&lt;自动义对象&gt;
**URL:** http://localhost:8080/list/listObject

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;自动义对象&gt;

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
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":2.02,
		"money":11.84,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	}
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,T&gt;&gt;结构

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
			"stuName":"鹏煊.朱",
			"stuAge":true,
			"stuAddress":"郑街197号， 盐城， 京 711291",
			"user":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":75.72,
				"money":41.96,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"郑街197号， 盐城， 京 711291"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"鹏煊.朱",
					"nickName":"gayle.quigley",
					"userAddress":"郑街197号， 盐城， 京 711291",
					"userAge":37,
					"phone":"15392341080",
					"createTime":1573029211927,
					"small":14.05,
					"money":80.01,
					"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
					"telephone":"15392341080"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":90.18,
				"money":34.33,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":69.39,
				"money":96.24,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":7.77,
				"money":64.77,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":15.18,
				"money":38.56,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"age":37
		}
	}
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listTeacher

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":59.49,
				"money":83.62,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":88.47,
				"money":86.44,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":28.81,
				"money":4.74,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"age":37
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://localhost:8080/list/listString1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":43.42,
				"money":48.95,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":45.08,
				"money":0.84,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":72.45,
				"money":83.73,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"age":37
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":81.47,
			"money":92.21,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":26.10,
			"money":14.24,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"age":37
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://localhost:8080/list/listString2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":37.59,
				"money":2.87,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":35.01,
				"money":90.31,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":43.77,
				"money":65.81,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"age":37
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":77.12,
				"money":39.23,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":71.39,
				"money":82.44,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":13.37,
				"money":23.63,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"age":37
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":71.41,
				"money":79.48,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":35.75,
				"money":56.24,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":92.22,
				"money":61.66,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"age":37
		},
		"age":37
	}
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://localhost:8080/list/listUserDto

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;List&lt;UserDto&gt;&gt;

**Request-example:**
```
http://localhost:8080/list/listUserDto
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
			"token":"rgq12f",
			"LoginList":[
				{
					"userName":"鹏煊.朱",
					"password":"4o2gq5"
				}
			]
		}
	],
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://localhost:8080/map/primitive

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Integer&gt;结构

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
	"mapKey1":534,
	"mapKey2":432
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://localhost:8080/map/objectValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Object&gt;结构

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
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":5.45,
		"money":22.24,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	}
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://localhost:8080/map/test1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Student&gt;结构

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
		"stuName":"鹏煊.朱",
		"stuAge":true,
		"stuAddress":"郑街197号， 盐城， 京 711291",
		"user":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":69.25,
			"money":20.40,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":55.08,
				"money":12.83,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":48.92,
			"money":78.18,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		}
	}
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":21.99,
				"money":96.94,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":13.11,
			"money":57.63,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"stuName":"鹏煊.朱",
			"stuAge":true,
			"stuAddress":"郑街197号， 盐城， 京 711291",
			"user":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":34.11,
				"money":21.57,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"郑街197号， 盐城， 京 711291"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"鹏煊.朱",
					"nickName":"gayle.quigley",
					"userAddress":"郑街197号， 盐城， 京 711291",
					"userAge":37,
					"phone":"15392341080",
					"createTime":1573029211927,
					"small":88.75,
					"money":95.88,
					"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
					"telephone":"15392341080"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":1.85,
				"money":86.92,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		},
		"age":37
	}
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":32.88,
				"money":24.57,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":35.09,
			"money":81.90,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"stuName":"鹏煊.朱",
			"stuAge":true,
			"stuAddress":"郑街197号， 盐城， 京 711291",
			"user":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":52.19,
				"money":94.26,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"郑街197号， 盐城， 京 711291"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"鹏煊.朱",
					"nickName":"gayle.quigley",
					"userAddress":"郑街197号， 盐城， 京 711291",
					"userAge":37,
					"phone":"15392341080",
					"createTime":1573029211927,
					"small":73.10,
					"money":67.60,
					"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
					"telephone":"15392341080"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":92.36,
				"money":76.95,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		},
		"age":37
	}
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构

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
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":18.12,
				"money":95.13,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":97.26,
				"money":68.36,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":74.00,
				"money":11.90,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		},
		"age":37
	}
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://localhost:8080/testRequestHeader

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader常规使用

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader?age=37
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader/value?age=37
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader/DefaultVal?age=37
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|true|-

**Request-example:**
```
http://localhost:8080/testNormalParams/binding?name=鹏煊.朱&age=37
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
			"githubAddress":"郑街197号， 盐城， 京 711291"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"鹏煊.朱",
	"nickName":"gayle.quigley",
	"userAddress":"郑街197号， 盐城， 京 711291",
	"userAge":37,
	"phone":"15392341080",
	"createTime":1573029211927,
	"small":94.48,
	"money":36.65,
	"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
	"telephone":"15392341080"
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
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":17.29,
		"money":18.73,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id|true|-

**Request-example:**
```
[
	"vzt36g",
	"j6vu4c"
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
http://localhost:8080/test/鹏煊.朱/ggf9w4/info
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|type|true|-

**Request-example:**
```
http://localhost:8080/testRequestParam?author=沈泽洋&type=i70jar
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
http://localhost:8080/testRequestParamWithValue?name=鹏煊.朱
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
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":3.02,
		"money":89.93,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	}
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://localhost:8080/simple/str

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回普通String测试

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
3nnwka
```

### 返回普通javabean
**URL:** http://localhost:8080/simple/user

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 返回普通javabean

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
			"githubAddress":"郑街197号， 盐城， 京 711291"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"鹏煊.朱",
	"nickName":"gayle.quigley",
	"userAddress":"郑街197号， 盐城， 京 711291",
	"userAge":37,
	"phone":"15392341080",
	"createTime":1573029211927,
	"small":0.18,
	"money":11.81,
	"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
	"telephone":"15392341080"
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
			"githubAddress":"郑街197号， 盐城， 京 711291"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"鹏煊.朱",
	"nickName":"gayle.quigley",
	"userAddress":"郑街197号， 盐城， 京 711291",
	"userAge":37,
	"phone":"15392341080",
	"createTime":1573029211927,
	"small":93.59,
	"money":40.43,
	"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
	"telephone":"15392341080"
}
```

### 返回复杂实体数据
**URL:** http://localhost:8080/simple/stu

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回复杂实体数据

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
	"stuName":"鹏煊.朱",
	"stuAge":true,
	"stuAddress":"郑街197号， 盐城， 京 711291",
	"user":{
		"userDetails":[
			{
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":85.11,
		"money":8.05,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	},
	"userMap":{
		"mapKey":{
			
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":45.36,
			"money":51.81,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":59.74,
		"money":24.44,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	}
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://localhost:8080/simple/teacher

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构

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
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":73.28,
			"money":20.29,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":92.94,
			"money":19.25,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":40.12,
			"money":44.84,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"age":37
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":51.15,
			"money":97.82,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":52.46,
			"money":75.55,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":97.18,
			"money":79.02,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"age":37
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":30.88,
			"money":95.70,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":52.51,
			"money":0.36,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":84.04,
			"money":57.38,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"age":37
	},
	"age":37
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://localhost:8080/simple/teacher2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;List&lt;User&gt;, User, Student&gt;

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
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":44.80,
			"money":23.55,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		}
	],
	"data1":{
		"userDetails":[
			{
				"githubAddress":"郑街197号， 盐城， 京 711291"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"鹏煊.朱",
		"nickName":"gayle.quigley",
		"userAddress":"郑街197号， 盐城， 京 711291",
		"userAge":37,
		"phone":"15392341080",
		"createTime":1573029211927,
		"small":17.21,
		"money":26.31,
		"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
		"telephone":"15392341080"
	},
	"data2":{
		"stuName":"鹏煊.朱",
		"stuAge":true,
		"stuAddress":"郑街197号， 盐城， 京 711291",
		"user":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":65.54,
			"money":31.33,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"郑街197号， 盐城， 京 711291"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"鹏煊.朱",
				"nickName":"gayle.quigley",
				"userAddress":"郑街197号， 盐城， 京 711291",
				"userAge":37,
				"phone":"15392341080",
				"createTime":1573029211927,
				"small":42.55,
				"money":66.02,
				"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
				"telephone":"15392341080"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"郑街197号， 盐城， 京 711291"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"鹏煊.朱",
			"nickName":"gayle.quigley",
			"userAddress":"郑街197号， 盐城， 京 711291",
			"userAge":37,
			"phone":"15392341080",
			"createTime":1573029211927,
			"small":57.38,
			"money":51.70,
			"ipv6":"ed1b:c50c:a00c:f3f3:1375:ac9a:8daf:1ea8",
			"telephone":"15392341080"
		}
	},
	"age":37
}
```

### 测试SubUser
**URL:** http://localhost:8080/simple/subUser

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试SubUser

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
	"subUserName":"鹏煊.朱",
	"numbers":581
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://localhost:8080/simple/subUser/result

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CommonResult&lt;SubUser&gt;

**Request-example:**
```
http://localhost:8080/simple/subUser/result
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
		"subUserName":"鹏煊.朱",
		"numbers":106
	},
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://localhost:8080/stringCommonResult

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;String&gt;

**Request-example:**
```
http://localhost:8080/stringCommonResult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"njkilt",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://localhost:8080/staff

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;

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
	"name":"鹏煊.朱",
	"annyObject":{
		"name":"鹏煊.朱",
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
			"name":"鹏煊.朱",
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
	"name":"鹏煊.朱",
	"annyObject":"ugwx98",
	"data":[
		"q8erp5"
	]
}
```

### JAVA继承测试
**URL:** http://localhost:8080/children

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** JAVA继承测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
{
	"name":"鹏煊.朱",
	"age":37
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
	"name":"鹏煊.朱",
	"age":37
}
```

## 用户信息操作接口
### 添加用户
**URL:** http://localhost:8080/user/add

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0

**Request-example:**
```
{
	"username":"鹏煊.朱",
	"password":"ibpffo",
	"nickName":"gayle.quigley",
	"mobile":"15531606842"
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
	"id":"107",
	"createBy":"cslo7z",
	"createTime":2019-11-06,
	"updateBy":"m94w0p",
	"updateTime":2019-11-06,
	"delFlag":6,
	"username":"鹏煊.朱",
	"password":"dcoqsc",
	"nickName":"gayle.quigley",
	"mobile":"15531606842",
	"email":"绍齐.田@gmail.com",
	"address":"郑街197号， 盐城， 京 711291",
	"sex":1,
	"avatar":"xoy5u6",
	"type":666,
	"status":312,
	"description":"2prch1",
	"roles":[
		{
			"id":"107",
			"createBy":"8k3bzg",
			"createTime":2019-11-06,
			"updateBy":"lo2i0n",
			"updateTime":2019-11-06,
			"delFlag":6,
			"name":"鹏煊.朱",
			"defaultRole":true,
			"permissions":[
				{
					"id":"107",
					"createBy":"hgcii5",
					"createTime":2019-11-06,
					"updateBy":"ajfmu2",
					"updateTime":2019-11-06,
					"delFlag":6,
					"name":"鹏煊.朱",
					"level":509,
					"type":36,
					"title":"34qlse",
					"path":"s3kgi1",
					"component":"mluhkf",
					"icon":"h2at6k",
					"buttonType":"4itxgy",
					"parentId":"107",
					"description":"d2tfvp",
					"sortOrder":320,
					"status":38,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"drnagb"
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
			"id":"107",
			"createBy":"c4fez6",
			"createTime":2019-11-06,
			"updateBy":"diqwpx",
			"updateTime":2019-11-06,
			"delFlag":6,
			"name":"鹏煊.朱",
			"level":916,
			"type":126,
			"title":"8fem2l",
			"path":"ujrupw",
			"component":"73xlpe",
			"icon":"bmifxw",
			"buttonType":"sopdqh",
			"parentId":"107",
			"description":"5efcbh",
			"sortOrder":233,
			"status":5,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"o7gy4w"
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0

**Request-example:**
```
{
	"username":"鹏煊.朱",
	"password":"0cyypm",
	"nickName":"gayle.quigley",
	"mobile":"15531606842"
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
	"id":"107",
	"createBy":"jpmjs4",
	"createTime":2019-11-06,
	"updateBy":"4k55tr",
	"updateTime":2019-11-06,
	"delFlag":6,
	"username":"鹏煊.朱",
	"password":"kbs80x",
	"nickName":"gayle.quigley",
	"mobile":"15531606842",
	"email":"绍齐.田@gmail.com",
	"address":"郑街197号， 盐城， 京 711291",
	"sex":1,
	"avatar":"jkscbu",
	"type":397,
	"status":508,
	"description":"6k9t3r",
	"roles":[
		{
			"id":"107",
			"createBy":"sa37uj",
			"createTime":2019-11-06,
			"updateBy":"zl8xfw",
			"updateTime":2019-11-06,
			"delFlag":6,
			"name":"鹏煊.朱",
			"defaultRole":true,
			"permissions":[
				{
					"id":"107",
					"createBy":"4022rd",
					"createTime":2019-11-06,
					"updateBy":"v05xo2",
					"updateTime":2019-11-06,
					"delFlag":6,
					"name":"鹏煊.朱",
					"level":421,
					"type":634,
					"title":"l1z1xs",
					"path":"vee1wk",
					"component":"v89bre",
					"icon":"tsc06t",
					"buttonType":"ew437d",
					"parentId":"107",
					"description":"y7s7wv",
					"sortOrder":835,
					"status":516,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"6bywtj"
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
			"id":"107",
			"createBy":"mpkx63",
			"createTime":2019-11-06,
			"updateBy":"78s8bt",
			"updateTime":2019-11-06,
			"delFlag":6,
			"name":"鹏煊.朱",
			"level":30,
			"type":421,
			"title":"513hus",
			"path":"j83ep1",
			"component":"7ykc62",
			"icon":"10tpfv",
			"buttonType":"ps03cx",
			"parentId":"107",
			"description":"u6n4ic",
			"sortOrder":363,
			"status":596,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"nadebp"
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

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-

**Request-example:**
```
{
	"name":"鹏煊.朱",
	"birthday":"2019-11-06",
	"age":37,
	"subject":{
		"subjectName":"鹏煊.朱"
	}
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### 验证通用参数
**URL:** http://localhost:8080/validator/valid

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** 验证通用参数

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
	"token":"x8zyf2",
	"sequenceNo":"sg8df4",
	"parameter":{
		"subUserName":"鹏煊.朱",
		"numbers":265
	}
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

## xss拦击测试
### xss过滤普通post请求
**URL:** http://localhost:8080/xss/text

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤普通post请求

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|true|-

**Request-example:**
```
{
	"text":"vhoodf"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"ob0r7t",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### xss过滤get请求
**URL:** http://localhost:8080/xss/query

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤get请求

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|true|-

**Request-example:**
```
http://localhost:8080/xss/query?query=knwml0
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"l8nv0r",
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
}
```

### xss过滤json数据
**URL:** http://localhost:8080/xss/json

**Type:** POST

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤json数据

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
{
	"name":"鹏煊.朱",
	"age":37
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|响应信息|-
data|object|响应数据|-
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
		"name":"鹏煊.朱",
		"age":37
	},
	"code":"29231",
	"timestamp":"2019-11-06 16:33:31"
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
