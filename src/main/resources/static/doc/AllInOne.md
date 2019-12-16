

## apiNote注解测试
### 测试apiNote
**URL:** http://localhost:8080/test

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 用于测试apiNote注释是否有效

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|token(Global)|true|-
partnerId|string|合作方账号(Global)|true|-


**Request-example:**
```
http://localhost:8080/test
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
projectName|string|project name|-
projectId|string|project id|-
language|string|docLanguage|-
apiDocList|array|doc list|-
└─order|int32|Order of controller|1.7+
└─name|string|controller name|-
└─alias|string|controller alias handled by md5|1.7+
└─list|array|List of method doc|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─methodId|string|methodId handled by md5|1.7.3 +
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|method name|1.7.3 +
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─order|int32|method order|1.7+
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─desc|string|method description|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─detail|string|detailed introduction of the method|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─url|string|controller method url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|string|http request type|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─headers|string|only used for generate markdown and adoc<br>http readers|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─contentType|string|http contentType|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─requestHeaders|array|http request headers|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|Request header name|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|string|Request header type|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─desc|string|Request header description|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─required|boolean|required flag|1.7.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─since|string|Starting version number|1.7.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─requestParams|array|http request params|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─field|string|field|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|string|field type|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─desc|string|description|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─required|boolean|require flag|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─version|string|version|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─requestUsage|string|http request usage|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─responseUsage|string|http response usage|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─responseParams|array|http response params|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─field|string|field|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|string|field type|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─desc|string|description|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─required|boolean|require flag|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─version|string|version|-
└─desc|string|method description|-
apiDocDictList|array|No comments found.|-
└─order|int32|order|-
└─title|string|dict title|-
└─dataDictList|array|data dict|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─value|string|dict value|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|string|code type|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─desc|string|dict desc|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ordinal|int32|enum ordinal|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|enum name|-
errorCodeList|array|error code list|-
└─value|string|dict value|-
└─type|string|code type|-
└─desc|string|dict desc|-
└─ordinal|int32|enum ordinal|-
└─name|string|enum name|-
revisionLogs|array|List of change log|-
└─version|string|version|-
└─status|string|status|-
└─author|string|author|-
└─revisionTime|string|update time|-
└─remarks|string|description|-

**Response-example:**
```
{
	"projectName":"文轩.卢",
	"projectId":"184",
	"language":"sx0jys",
	"apiDocList":[
		{
			"order":359,
			"name":"文轩.卢",
			"alias":"sfn25h",
			"list":[
				{
					"methodId":"184",
					"name":"文轩.卢",
					"order":394,
					"desc":"eocpgu",
					"detail":"6xsqbl",
					"url":"www.xn---xn--ilr-us2pl308a.biz",
					"type":"kb3hm4",
					"headers":"kcqcsg",
					"contentType":"op0b0a",
					"requestHeaders":[
						{
							"name":"文轩.卢",
							"type":"csecot",
							"desc":"olm4ro",
							"required":true,
							"since":"yqv5bc"
						}
					],
					"requestParams":[
						{
							"field":"omou2h",
							"type":"0jskei",
							"desc":"pzyqr4",
							"required":true,
							"version":"0.00"
						}
					],
					"requestUsage":"pdpskj",
					"responseUsage":"gn83ru",
					"responseParams":[
						{
							"field":"04d6ct",
							"type":"9gjbkw",
							"desc":"tr9j80",
							"required":true,
							"version":"0.00"
						}
					]
				}
			],
			"desc":"et9w6p"
		}
	],
	"apiDocDictList":[
		{
			"order":903,
			"title":"79cp6w",
			"dataDictList":[
				{
					"value":"wrl2hg",
					"type":"6ln4u1",
					"desc":"3d7wod",
					"ordinal":788,
					"name":"文轩.卢"
				}
			]
		}
	],
	"errorCodeList":[
		{
			"value":"63i40b",
			"type":"7fse9p",
			"desc":"j1zv3e",
			"ordinal":794,
			"name":"文轩.卢"
		}
	],
	"revisionLogs":[
		{
			"version":"0.00",
			"status":"x058wn",
			"author":"韦金鑫",
			"revisionTime":"2019-12-15 13:56:15",
			"remarks":"eay7ih"
		}
	]
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
http://localhost:8080/app/test?name=文轩.卢
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
i0xln9
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"pqrteg",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"027djr",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"q4e1tm",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"userName":"文轩.卢",
	"roles":[
		{
			"id":"184",
			"users":[
				{
					"userName":"文轩.卢",
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
35goo4
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
3pac3e
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
amxszx
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"3mxbwk",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"0fkr4c",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"name":"文轩.卢",
	"innerClass":{
		"phone":"13099815931"
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
	"localDate":"2019-12-15",
	"localDateTime":"2019-12-15 13:56:15"
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
	"localDate":"2019-12-15",
	"localDateTime":"2019-12-15 13:56:15"
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
	"username":"文轩.卢",
	"idCard":"310601198003162104"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"文轩.卢"
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
	"username":"文轩.卢",
	"idCard":"310601198003162104"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"文轩.卢"
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
	"tbxw1f",
	"k9skt9"
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
		"mapKey1":"uhps2c",
		"mapKey2":"3gyqed"
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
subUser1|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
subUser2|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
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
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":177
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":459
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":26.38,
		"money":28.51,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
			"stuName":"文轩.卢",
			"stuAge":true,
			"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"user":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":994
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":339
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":38.55,
				"money":48.76,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"userMap":{
				"mapKey":{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":360
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":445
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":65.14,
					"money":36.78,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			},
			"userTreeSet":[
				{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":162
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":890
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":23.62,
					"money":79.64,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			],
			"user1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":733
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":577
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":58.59,
				"money":58.67,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":523
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":902
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":57.19,
				"money":48.12,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":315
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":232
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":16.31,
				"money":42.81,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data2":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":574
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":114
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":79.46,
				"money":48.51,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"age":57
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":636
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":527
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":79.76,
				"money":64.29,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"data1":[
			{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":140
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":570
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":39.37,
				"money":53.44,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"data2":[
			{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":51
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":430
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":83.00,
				"money":27.65,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"age":57
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":281
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":39
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":81.62,
				"money":82.88,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":540
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":625
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":95.93,
				"money":14.91,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data2":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":932
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":56
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":3.64,
				"money":21.11,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"age":57
		},
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":337
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":424
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":3.46,
			"money":58.90,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":609
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":463
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":95.32,
			"money":96.87,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"age":57
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":937
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":572
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":22.19,
				"money":5.09,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":262
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":140
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":96.49,
				"money":73.58,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data2":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":641
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":97
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":84.04,
				"money":94.12,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"age":57
		},
		"data1":{
			"data":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":616
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":689
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":61.49,
				"money":22.28,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":197
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":419
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":97.82,
				"money":84.64,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data2":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":714
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":218
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":83.42,
				"money":25.47,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"age":57
		},
		"data2":{
			"data":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":352
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":238
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":15.54,
				"money":71.81,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":499
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":175
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":41.69,
				"money":90.95,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"data2":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":440
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":670
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":89.97,
				"money":83.92,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"age":57
		},
		"age":57
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
			"token":"z39aee",
			"LoginList":[
				{
					"userName":"文轩.卢",
					"password":"819gu4"
				}
			]
		}
	],
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"mapKey1":647,
	"mapKey2":686
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
subUser1|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
subUser2|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
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
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":906
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":589
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":73.22,
		"money":81.10,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
		"stuName":"文轩.卢",
		"stuAge":true,
		"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"user":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":359
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":906
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":34.89,
			"money":82.11,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"userMap":{
			"mapKey":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":841
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":50
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":41.79,
				"money":94.53,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"userTreeSet":[
			{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":883
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":204
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":78.60,
				"money":35.51,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"user1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":834
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":502
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":49.67,
			"money":7.87,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":241
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":264
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":91.59,
				"money":43.89,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":926
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":48
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":43.39,
			"money":6.16,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"stuName":"文轩.卢",
			"stuAge":true,
			"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"user":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":252
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":849
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":71.65,
				"money":98.09,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"userMap":{
				"mapKey":{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":825
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":462
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":87.81,
					"money":66.05,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			},
			"userTreeSet":[
				{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":177
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":173
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":91.63,
					"money":4.41,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			],
			"user1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":840
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":325
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":72.24,
				"money":95.16,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"age":57
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":238
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":9
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":43.61,
				"money":84.90,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":851
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":51
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":99.62,
			"money":77.48,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"stuName":"文轩.卢",
			"stuAge":true,
			"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"user":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":730
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":937
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":71.98,
				"money":69.82,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			},
			"userMap":{
				"mapKey":{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":779
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":346
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":15.23,
					"money":39.84,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			},
			"userTreeSet":[
				{
					"subUser1":{
						"subUserName":"文轩.卢",
						"numbers":427
					},
					"subUser2":{
						"subUserName":"文轩.卢",
						"numbers":95
					},
					"userName":"文轩.卢",
					"nickName":"damian.streich",
					"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
					"userAge":57,
					"phone":"13099815931",
					"createTime":1576389375357,
					"small":5.91,
					"money":38.94,
					"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
					"telephone":"13099815931"
				}
			],
			"user1":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":686
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":482
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":68.93,
				"money":7.24,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"age":57
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":815
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":311
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":58.77,
				"money":78.54,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"data1":{
			"mapKey":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":877
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":41
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":46.18,
				"money":93.79,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"data2":{
			"mapKey":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":290
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":612
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":86.83,
				"money":33.69,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"age":57
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
http://localhost:8080/testRequestHeader?age=57
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
http://localhost:8080/testRequestHeader/DefaultVal?age=57
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
http://localhost:8080/testNormalParams/binding?name=文轩.卢&age=57
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
subUser1|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
subUser2|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
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
	"subUser1":{
		"subUserName":"文轩.卢",
		"numbers":671
	},
	"subUser2":{
		"subUserName":"文轩.卢",
		"numbers":545
	},
	"userName":"文轩.卢",
	"nickName":"damian.streich",
	"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"userAge":57,
	"phone":"13099815931",
	"createTime":1576389375357,
	"small":60.66,
	"money":18.13,
	"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
	"telephone":"13099815931"
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
subUser1|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
subUser2|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
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
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":742
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":186
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":91.68,
		"money":95.17,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
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
	"psyrko",
	"aqk4xx"
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
http://localhost:8080/test/文轩.卢/zdluuy/info
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
http://localhost:8080/testRequestParam?author=韦金鑫&type=czjtvn
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
http://localhost:8080/testRequestParamWithValue?name=文轩.卢
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
http://localhost:8080/testMuchPath/get/226;	http://localhost:8080/testMuchPath/find/226
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
http://localhost:8080/get/805/313;	http://localhost:8080/find/805/313
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
subUser1|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
subUser2|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
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
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":395
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":880
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":82.46,
		"money":17.79,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
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
rhpw1x
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
subUser1|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
subUser2|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-
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
	"subUser1":{
		"subUserName":"文轩.卢",
		"numbers":380
	},
	"subUser2":{
		"subUserName":"文轩.卢",
		"numbers":724
	},
	"userName":"文轩.卢",
	"nickName":"damian.streich",
	"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"userAge":57,
	"phone":"13099815931",
	"createTime":1576389375357,
	"small":18.45,
	"money":37.87,
	"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
	"telephone":"13099815931"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
subUser1|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
subUser2|object|No comments found.|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
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
	"subUser1":{
		"subUserName":"文轩.卢",
		"numbers":707
	},
	"subUser2":{
		"subUserName":"文轩.卢",
		"numbers":543
	},
	"userName":"文轩.卢",
	"nickName":"damian.streich",
	"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"userAge":57,
	"phone":"13099815931",
	"createTime":1576389375357,
	"small":89.92,
	"money":40.36,
	"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
	"telephone":"13099815931"
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
	"stuName":"文轩.卢",
	"stuAge":true,
	"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"user":{
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":741
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":289
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":66.07,
		"money":72.27,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
	},
	"userMap":{
		"mapKey":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":621
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":965
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":86.18,
			"money":20.05,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		}
	},
	"userTreeSet":[
		{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":320
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":720
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":97.70,
			"money":96.35,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		}
	],
	"user1":{
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":668
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":821
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":15.16,
		"money":83.44,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":676
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":947
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":42.63,
			"money":80.44,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":248
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":98
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":5.75,
			"money":8.96,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":935
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":798
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":72.47,
			"money":44.26,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"age":57
	},
	"data1":{
		"data":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":756
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":576
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":65.47,
			"money":7.94,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":737
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":66
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":37.05,
			"money":68.29,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":763
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":190
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":39.66,
			"money":0.62,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"age":57
	},
	"data2":{
		"data":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":410
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":859
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":56.49,
			"money":58.83,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":18
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":809
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":60.04,
			"money":54.66,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"data2":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":977
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":9
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":92.09,
			"money":45.69,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"age":57
	},
	"age":57
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser1|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUser2|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─subUserName|string|用户名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─numbers|number|bigInteger|-
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
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":17
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":894
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":36.79,
			"money":75.23,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		}
	],
	"data1":{
		"subUser1":{
			"subUserName":"文轩.卢",
			"numbers":785
		},
		"subUser2":{
			"subUserName":"文轩.卢",
			"numbers":820
		},
		"userName":"文轩.卢",
		"nickName":"damian.streich",
		"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"userAge":57,
		"phone":"13099815931",
		"createTime":1576389375357,
		"small":26.45,
		"money":84.06,
		"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
		"telephone":"13099815931"
	},
	"data2":{
		"stuName":"文轩.卢",
		"stuAge":true,
		"stuAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
		"user":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":207
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":639
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":20.21,
			"money":98.66,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		},
		"userMap":{
			"mapKey":{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":817
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":561
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":99.11,
				"money":38.43,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		},
		"userTreeSet":[
			{
				"subUser1":{
					"subUserName":"文轩.卢",
					"numbers":753
				},
				"subUser2":{
					"subUserName":"文轩.卢",
					"numbers":542
				},
				"userName":"文轩.卢",
				"nickName":"damian.streich",
				"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
				"userAge":57,
				"phone":"13099815931",
				"createTime":1576389375357,
				"small":10.27,
				"money":38.38,
				"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
				"telephone":"13099815931"
			}
		],
		"user1":{
			"subUser1":{
				"subUserName":"文轩.卢",
				"numbers":287
			},
			"subUser2":{
				"subUserName":"文轩.卢",
				"numbers":314
			},
			"userName":"文轩.卢",
			"nickName":"damian.streich",
			"userAddress":"Apt. 079 何中心32号， 拉萨， 黑 580707",
			"userAge":57,
			"phone":"13099815931",
			"createTime":1576389375357,
			"small":33.90,
			"money":40.58,
			"ipv6":"0227:4ebc:e960:2a36:6cf2:647d:72fc:ae3b",
			"telephone":"13099815931"
		}
	},
	"age":57
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
	"subUserName":"文轩.卢",
	"numbers":71
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
		"subUserName":"文轩.卢",
		"numbers":159
	},
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"data":"r8q6vd",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"name":"文轩.卢",
	"annyObject":{
		"name":"文轩.卢",
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
			"name":"文轩.卢",
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
	"name":"文轩.卢",
	"annyObject":"5x88tt",
	"data":[
		"2xelzt"
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
	"name":"文轩.卢",
	"age":57
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
	"name":"文轩.卢",
	"age":57
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
	"username":"文轩.卢",
	"password":"ka87hp",
	"nickName":"damian.streich",
	"mobile":"15998214064",
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
	"id":"184",
	"createBy":"vpae2w",
	"createTime":"2019-12-15",
	"updateBy":"aqjygh",
	"updateTime":"2019-12-15",
	"delFlag":8,
	"username":"文轩.卢",
	"password":"fpus8q",
	"nickName":"damian.streich",
	"mobile":"15998214064",
	"email":"峻熙.潘@gmail.com",
	"address":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"sex":1,
	"avatar":"bbf1l7",
	"type":394,
	"status":975,
	"description":"70b4fm",
	"roles":[
		{
			"id":"184",
			"createBy":"n8838d",
			"createTime":"2019-12-15",
			"updateBy":"oe9nlo",
			"updateTime":"2019-12-15",
			"delFlag":8,
			"name":"文轩.卢",
			"defaultRole":true,
			"permissions":[
				{
					"id":"184",
					"createBy":"dxirds",
					"createTime":"2019-12-15",
					"updateBy":"lsvyzt",
					"updateTime":"2019-12-15",
					"delFlag":8,
					"name":"文轩.卢",
					"level":323,
					"type":492,
					"title":"ws0o5w",
					"path":"1ioqfa",
					"component":"blj1qy",
					"icon":"sejip7",
					"buttonType":"vdqw09",
					"parentId":"184",
					"description":"0l5u2u",
					"sortOrder":749,
					"status":334,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"942nff"
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
			"id":"184",
			"createBy":"327vi8",
			"createTime":"2019-12-15",
			"updateBy":"1vuku8",
			"updateTime":"2019-12-15",
			"delFlag":8,
			"name":"文轩.卢",
			"level":52,
			"type":613,
			"title":"vo01g2",
			"path":"tovz8m",
			"component":"vgrj73",
			"icon":"0mzot0",
			"buttonType":"j943j9",
			"parentId":"184",
			"description":"2e36bq",
			"sortOrder":231,
			"status":367,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"hg4ram"
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
	"username":"文轩.卢",
	"password":"zz2dfz",
	"nickName":"damian.streich",
	"mobile":"15998214064",
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
	"id":"184",
	"createBy":"ipiigs",
	"createTime":"2019-12-15",
	"updateBy":"7b3h8b",
	"updateTime":"2019-12-15",
	"delFlag":8,
	"username":"文轩.卢",
	"password":"hgepgs",
	"nickName":"damian.streich",
	"mobile":"15998214064",
	"email":"峻熙.潘@gmail.com",
	"address":"Apt. 079 何中心32号， 拉萨， 黑 580707",
	"sex":1,
	"avatar":"33b50d",
	"type":442,
	"status":286,
	"description":"62ztxr",
	"roles":[
		{
			"id":"184",
			"createBy":"8rt0q4",
			"createTime":"2019-12-15",
			"updateBy":"xuwz5n",
			"updateTime":"2019-12-15",
			"delFlag":8,
			"name":"文轩.卢",
			"defaultRole":true,
			"permissions":[
				{
					"id":"184",
					"createBy":"2fjdpa",
					"createTime":"2019-12-15",
					"updateBy":"ei788y",
					"updateTime":"2019-12-15",
					"delFlag":8,
					"name":"文轩.卢",
					"level":203,
					"type":193,
					"title":"b7nvzd",
					"path":"krquoy",
					"component":"wx35i3",
					"icon":"uivbke",
					"buttonType":"bvz0kp",
					"parentId":"184",
					"description":"ncpkhk",
					"sortOrder":984,
					"status":394,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"52jj9w"
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
			"id":"184",
			"createBy":"y5cyvd",
			"createTime":"2019-12-15",
			"updateBy":"ftefba",
			"updateTime":"2019-12-15",
			"delFlag":8,
			"name":"文轩.卢",
			"level":366,
			"type":969,
			"title":"2pb24n",
			"path":"3zq7he",
			"component":"u4ell5",
			"icon":"0tyodj",
			"buttonType":"ltzw87",
			"parentId":"184",
			"description":"749n6f",
			"sortOrder":423,
			"status":934,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"yutglz"
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
└─subjectName|string|科目名称|true|-

**Request-example:**
```
{
	"name":"文轩.卢",
	"birthday":"2019-12-15",
	"age":57,
	"subject":{
		"subjectName":"文轩.卢"
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"token":"0xhr5e",
	"sequenceNo":"xmbpvz",
	"parameter":{
		"subUserName":"文轩.卢",
		"numbers":908
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
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"text":"x7rg0r"
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
	"data":"fuq99i",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
http://localhost:8080/xss/query?query=n3ffvi
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
	"data":"cjx7xw",
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
	"name":"文轩.卢",
	"age":57
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
		"name":"文轩.卢",
		"age":57
	},
	"code":"6995",
	"timestamp":"2019-12-15 13:56:15"
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
