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
			"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"弘文.邹",
	"nickName":"loyd.keeling",
	"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"userAge":32,
	"phone":"17768732471",
	"createTime":1572765555995,
	"small":77.58,
	"money":0.12,
	"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
	"telephone":"17768732471"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
94kqca
```

## app端接口测试
### app测试
**URL:** http://localhost:8080/app/test

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** app测试

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
http://localhost:8080/app/test?name=弘文.邹
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
no param name|string|The api directly returns the string type value.|-

**Response-example:**
```
yyfeih
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://localhost:8080/testCallable

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-example:**
```
http://localhost:8080/testCallable
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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/async-deferredresult

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"3ua590",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://localhost:8080/WebAsync/timeout

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/future

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"4nb2rt",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/completableFuture

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"goor9a",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

## 接收表单参数
### 测试formData
**URL:** http://localhost:8080/formData1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"y1sk16",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 测试http
**URL:** http://localhost:8080/testHttp

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"r4ul12",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://localhost:8080/inner/class

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"name":"弘文.邹",
	"innerClass":{
		"phone":"17768732471"
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
	"localDate":"2019-11-03",
	"localDateTime":"2019-11-03 15:19:16"
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
	"localDate":"2019-11-03",
	"localDateTime":"2019-11-03 15:19:16"
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
	"username":"弘文.邹",
	"idCard":"641001199511271087"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"弘文.邹"
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
	"username":"弘文.邹",
	"idCard":"641001199511271087"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"弘文.邹"
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://localhost:8080/list/listString

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"itxkcl",
	"wp55qs"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
		"mapKey1":"3bwaqi",
		"mapKey2":"a83jko"
	}
]
```

### List&lt;自动义对象&gt;
**URL:** http://localhost:8080/list/listObject

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":91.87,
		"money":2.35,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	}
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
			"stuName":"弘文.邹",
			"stuAge":true,
			"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":87.26,
				"money":17.96,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"弘文.邹",
					"nickName":"loyd.keeling",
					"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
					"userAge":32,
					"phone":"17768732471",
					"createTime":1572765555995,
					"small":91.63,
					"money":60.21,
					"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
					"telephone":"17768732471"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":13.96,
				"money":43.53,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		}
	}
]
```

### List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listMap3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":3.16,
				"money":29.02,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":61.72,
				"money":63.37,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":6.36,
				"money":55.68,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"age":32
		}
	}
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listTeacher

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":29.35,
				"money":92.46,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":53.32,
				"money":46.97,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":28.25,
				"money":59.66,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"age":32
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://localhost:8080/list/listString1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":57.42,
				"money":80.95,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":30.31,
				"money":23.37,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":91.39,
				"money":60.63,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"age":32
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":46.51,
			"money":0.86,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":49.40,
			"money":8.38,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"age":32
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://localhost:8080/list/listString2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":72.83,
				"money":32.60,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":39.53,
				"money":49.42,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":9.82,
				"money":23.14,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"age":32
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":25.10,
				"money":47.89,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":21.54,
				"money":35.63,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":25.92,
				"money":40.10,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"age":32
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":50.56,
				"money":68.40,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":23.96,
				"money":56.07,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":46.41,
				"money":8.79,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"age":32
		},
		"age":32
	}
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://localhost:8080/list/listUserDto

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
			"token":"d2lej6",
			"LoginList":[
				{
					"userName":"弘文.邹",
					"password":"i0oe3q"
				}
			]
		}
	],
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://localhost:8080/map/primitive

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
	"mapKey1":681,
	"mapKey2":542
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://localhost:8080/map/objectValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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

**Content-Type:** application/x-www-form-urlencoded

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
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":91.74,
		"money":27.19,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	}
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://localhost:8080/map/test1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
		"stuName":"弘文.邹",
		"stuAge":true,
		"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"user":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":63.96,
			"money":16.01,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":79.71,
				"money":51.36,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":21.61,
			"money":86.32,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		}
	}
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":27.55,
				"money":16.84,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":14.90,
			"money":8.21,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"stuName":"弘文.邹",
			"stuAge":true,
			"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":60.83,
				"money":0.96,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"弘文.邹",
					"nickName":"loyd.keeling",
					"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
					"userAge":32,
					"phone":"17768732471",
					"createTime":1572765555995,
					"small":73.08,
					"money":7.94,
					"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
					"telephone":"17768732471"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":42.53,
				"money":99.20,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		},
		"age":32
	}
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":98.11,
				"money":33.37,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":36.34,
			"money":67.53,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"stuName":"弘文.邹",
			"stuAge":true,
			"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":19.30,
				"money":2.35,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			},
			"userMap":{
				"mapKey":{
					
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"弘文.邹",
					"nickName":"loyd.keeling",
					"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
					"userAge":32,
					"phone":"17768732471",
					"createTime":1572765555995,
					"small":92.51,
					"money":70.66,
					"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
					"telephone":"17768732471"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":80.72,
				"money":85.89,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		},
		"age":32
	}
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":57.07,
				"money":47.92,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":27.76,
				"money":79.18,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":27.74,
				"money":88.88,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		},
		"age":32
	}
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://localhost:8080/testRequestHeader

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** 测试RequestHeader常规使用

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader?age=32
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定参数名
**URL:** http://localhost:8080/testRequestHeader/value

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** 测试RequestHeader绑定参数名

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader/value?age=32
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定默认值
**URL:** http://localhost:8080/testRequestHeader/DefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** 测试RequestHeader绑定默认值

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
http://localhost:8080/testRequestHeader/DefaultVal?age=32
```

**Response-example:**
```
This api return nothing.
```

## Spring boot params test
### Test Normal param binding
**URL:** http://localhost:8080/testNormalParams/binding

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** Test Normal param binding

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|true|-

**Request-example:**
```
http://localhost:8080/testNormalParams/binding?name=弘文.邹&age=32
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
			"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"弘文.邹",
	"nickName":"loyd.keeling",
	"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"userAge":32,
	"phone":"17768732471",
	"createTime":1572765555995,
	"small":27.49,
	"money":51.45,
	"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
	"telephone":"17768732471"
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
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":19.03,
		"money":31.27,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
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
	"b4hsmx",
	"cxnmew"
]
```

**Response-example:**
```
This api return nothing.
```

### Test @PathVariable
**URL:** http://localhost:8080/test/{name}/{no}/info

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** Test @PathVariable

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
http://localhost:8080/test/弘文.邹/8v40o4/info
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam
**URL:** http://localhost:8080/testRequestParam

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** Test @RequestParam

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|type|true|-

**Request-example:**
```
http://localhost:8080/testRequestParam?author=张熠彤&type=owlot2
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with value
**URL:** http://localhost:8080/testRequestParamWithValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** Use@RequestParam binding value is name,but method param name is userName

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
http://localhost:8080/testRequestParamWithValue?name=弘文.邹
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with default value
**URL:** http://localhost:8080/testRequestParamWithDefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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

**Content-Type:** application/x-www-form-urlencoded

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
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":48.41,
		"money":57.95,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	}
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://localhost:8080/simple/str

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

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
lovt0l
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
			"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"弘文.邹",
	"nickName":"loyd.keeling",
	"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"userAge":32,
	"phone":"17768732471",
	"createTime":1572765555995,
	"small":2.52,
	"money":40.73,
	"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
	"telephone":"17768732471"
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
			"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"弘文.邹",
	"nickName":"loyd.keeling",
	"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"userAge":32,
	"phone":"17768732471",
	"createTime":1572765555995,
	"small":83.38,
	"money":44.19,
	"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
	"telephone":"17768732471"
}
```

### 返回复杂实体数据
**URL:** http://localhost:8080/simple/stu

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
	"stuName":"弘文.邹",
	"stuAge":true,
	"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"user":{
		"userDetails":[
			{
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":99.74,
		"money":42.97,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	},
	"userMap":{
		"mapKey":{
			
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":94.82,
			"money":28.55,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":69.15,
		"money":80.94,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	}
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://localhost:8080/simple/teacher

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":5.01,
			"money":53.43,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":80.74,
			"money":46.68,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":63.65,
			"money":81.08,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"age":32
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":39.62,
			"money":38.48,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":50.59,
			"money":42.42,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":87.04,
			"money":49.10,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"age":32
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":24.36,
			"money":94.90,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":7.82,
			"money":76.74,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":25.43,
			"money":58.80,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"age":32
	},
	"age":32
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://localhost:8080/simple/teacher2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":59.95,
			"money":5.09,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		}
	],
	"data1":{
		"userDetails":[
			{
				"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"弘文.邹",
		"nickName":"loyd.keeling",
		"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"userAge":32,
		"phone":"17768732471",
		"createTime":1572765555995,
		"small":65.18,
		"money":28.58,
		"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
		"telephone":"17768732471"
	},
	"data2":{
		"stuName":"弘文.邹",
		"stuAge":true,
		"stuAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
		"user":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":58.06,
			"money":40.79,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		},
		"userMap":{
			"mapKey":{
				
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"弘文.邹",
				"nickName":"loyd.keeling",
				"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
				"userAge":32,
				"phone":"17768732471",
				"createTime":1572765555995,
				"small":80.89,
				"money":42.90,
				"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
				"telephone":"17768732471"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"弘文.邹",
			"nickName":"loyd.keeling",
			"userAddress":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
			"userAge":32,
			"phone":"17768732471",
			"createTime":1572765555995,
			"small":49.37,
			"money":53.95,
			"ipv6":"b96e:00be:1bef:297c:b631:5345:3ce0:08a4",
			"telephone":"17768732471"
		}
	},
	"age":32
}
```

### 测试SubUser
**URL:** http://localhost:8080/simple/subUser

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
	"subUserName":"弘文.邹",
	"numbers":692
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://localhost:8080/simple/subUser/result

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
		"subUserName":"弘文.邹",
		"numbers":961
	},
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://localhost:8080/stringCommonResult

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
	"data":"692mbo",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://localhost:8080/staff

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded

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
	"name":"弘文.邹",
	"annyObject":{
		"name":"弘文.邹",
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
			"name":"弘文.邹",
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

**Content-Type:** application/x-www-form-urlencoded

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
	"name":"弘文.邹",
	"annyObject":"z3ro06",
	"data":[
		"wm9uvh"
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
	"name":"弘文.邹",
	"age":32
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
	"name":"弘文.邹",
	"age":32
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
	"username":"弘文.邹",
	"password":"sv0sgm",
	"nickName":"loyd.keeling",
	"mobile":"15686973400"
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
	"id":"36",
	"createBy":"tcm4yy",
	"createTime":2019-11-03,
	"updateBy":"nxpepi",
	"updateTime":2019-11-03,
	"delFlag":5,
	"username":"弘文.邹",
	"password":"p4b7xk",
	"nickName":"loyd.keeling",
	"mobile":"15686973400",
	"email":"鹏煊.萧@yahoo.com",
	"address":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"sex":1,
	"avatar":"kfzr2l",
	"type":736,
	"status":190,
	"description":"471xrq",
	"roles":[
		{
			"id":"36",
			"createBy":"pityf0",
			"createTime":2019-11-03,
			"updateBy":"sacsbc",
			"updateTime":2019-11-03,
			"delFlag":5,
			"name":"弘文.邹",
			"defaultRole":true,
			"permissions":[
				{
					"id":"36",
					"createBy":"v7u9x5",
					"createTime":2019-11-03,
					"updateBy":"4f7vxw",
					"updateTime":2019-11-03,
					"delFlag":5,
					"name":"弘文.邹",
					"level":309,
					"type":360,
					"title":"64oefs",
					"path":"ucfpz3",
					"component":"jx16l4",
					"icon":"orbfjl",
					"buttonType":"l6nx43",
					"parentId":"36",
					"description":"h31p97",
					"sortOrder":660,
					"status":213,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"fyoyyi"
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
			"id":"36",
			"createBy":"f5svr3",
			"createTime":2019-11-03,
			"updateBy":"umzw4c",
			"updateTime":2019-11-03,
			"delFlag":5,
			"name":"弘文.邹",
			"level":217,
			"type":47,
			"title":"1ee3pj",
			"path":"2mkkej",
			"component":"t1klrq",
			"icon":"0cow8g",
			"buttonType":"vic44s",
			"parentId":"36",
			"description":"1kwmri",
			"sortOrder":451,
			"status":113,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"dlds6n"
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
	"username":"弘文.邹",
	"password":"zo6x0r",
	"nickName":"loyd.keeling",
	"mobile":"15686973400"
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
	"id":"36",
	"createBy":"utt79s",
	"createTime":2019-11-03,
	"updateBy":"d7oq1r",
	"updateTime":2019-11-03,
	"delFlag":5,
	"username":"弘文.邹",
	"password":"guvt7l",
	"nickName":"loyd.keeling",
	"mobile":"15686973400",
	"email":"鹏煊.萧@yahoo.com",
	"address":"Apt. 511 罗街42号， 克拉玛依， 粤 859540",
	"sex":1,
	"avatar":"tatj8o",
	"type":200,
	"status":959,
	"description":"eo72fl",
	"roles":[
		{
			"id":"36",
			"createBy":"lz4zt7",
			"createTime":2019-11-03,
			"updateBy":"endwic",
			"updateTime":2019-11-03,
			"delFlag":5,
			"name":"弘文.邹",
			"defaultRole":true,
			"permissions":[
				{
					"id":"36",
					"createBy":"co3zz0",
					"createTime":2019-11-03,
					"updateBy":"cs3f9c",
					"updateTime":2019-11-03,
					"delFlag":5,
					"name":"弘文.邹",
					"level":645,
					"type":418,
					"title":"432hef",
					"path":"6oc52o",
					"component":"jg1pgn",
					"icon":"kxl7pb",
					"buttonType":"ahruzk",
					"parentId":"36",
					"description":"3ogng6",
					"sortOrder":353,
					"status":93,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"fztvqv"
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
			"id":"36",
			"createBy":"4n7x11",
			"createTime":2019-11-03,
			"updateBy":"lezmrj",
			"updateTime":2019-11-03,
			"delFlag":5,
			"name":"弘文.邹",
			"level":798,
			"type":40,
			"title":"wrsjcp",
			"path":"rcdkn3",
			"component":"issb1h",
			"icon":"p8swp1",
			"buttonType":"rbis4y",
			"parentId":"36",
			"description":"9mrsar",
			"sortOrder":627,
			"status":401,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"vgxbak"
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
	"name":"弘文.邹",
	"birthday":"2019-11-03",
	"age":32,
	"subject":{
		"subjectName":"弘文.邹"
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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
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
	"token":"6a4oce",
	"sequenceNo":"aj662v",
	"parameter":{
		"subUserName":"弘文.邹",
		"numbers":51
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
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
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
	"text":"q61kdp"
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
	"data":"m45v2y",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

### xss过滤get请求
**URL:** http://localhost:8080/xss/query

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded

**Description:** xss过滤get请求

**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|true|-

**Request-example:**
```
http://localhost:8080/xss/query?query=qgtb00
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
	"data":"h3r27r",
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
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
	"name":"弘文.邹",
	"age":32
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
		"name":"弘文.邹",
		"age":32
	},
	"code":"92287",
	"timestamp":"2019-11-03 15:19:15"
}
```

