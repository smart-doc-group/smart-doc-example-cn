# smart-doc
Version |  Update Time  | Status | Author |  Description
------|--------|-----|------|-------
1.0|2019-10-12|use|author|desc



## apiNote注解测试
### ~~Test apiNote tag~~
**URL:** http://127.0.0.1/test

**Type:** POST

**Author:** cht

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 用于测试apiNote注释是否有效

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -i http://127.0.0.1/test  --data 'userDetails[0].githubAddress=Suite 914 秦旁76号， 宿迁， 渝 703450&userName=正豪.龙&nickName=keneth.turcotte&userAddress=Suite 914 秦旁76号， 宿迁， 渝 703450&userAge=44&phone=14516363332&createTime=1579397654398&small=31.63&money=57.89&ipv6=dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf&telephone=14516363332'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
mwque0
```

## app端接口测试
### app测试
**URL:** http://127.0.0.1/app/test

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/app/test?name=正豪.龙
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
dadyy9
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://127.0.0.1/testCallable

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/testCallable
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1/async-deferredresult

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/async-deferredresult
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
	"data":"5sxqq4",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://127.0.0.1/WebAsync/timeout

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/WebAsync/timeout
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1/future

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/future
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
	"data":"50unbw",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1/completableFuture

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/completableFuture
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
	"data":"7uaysz",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## 循环引用依赖测试
### 循环依赖参数推导
**URL:** http://127.0.0.1/circularReference

**Type:** GET


**Content-Type:** application/json; charset=utf-8

**Description:** 循环依赖参数推导(不建议使用)

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X GET -i http://127.0.0.1/circularReference
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
ny5kfy
```

## 自定意义注释tag测试
### 使用mock获取自定义值
**URL:** http://127.0.0.1/mock

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 使用mock获取自定义值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
subUserName|string|用户名称|false|-
numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/mock --data '{
	"subUserName":"正豪.龙",
	"numbers":495
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─simpleEnum|object|简单枚举|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─gender|object|性别(See: 性别数据字典)|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"simpleEnum":"RED",
		"username":"正豪.龙",
		"password":"4ormnp",
		"nickName":"keneth.turcotte",
		"mobile":"17068890973",
		"gender":0
	},
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## 枚举参数测试
### 获取枚举参数
**URL:** http://127.0.0.1/enum

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/enum?simpleEnum=RED
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
y8xqkj
```

### 获取枚举参数
**URL:** http://127.0.0.1/enum/{simpleEnum}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|object|简单枚举|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/enum/RED
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
ij2zxd
```

## 文件上传测试
### 上传单个文件
**URL:** http://127.0.0.1/upload

**Type:** POST


**Content-Type:** multipart/form-data

**Description:** 上传单个文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|用户id|true|-
file|file|文件|true|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/upload  --data 'userId=112'
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 批量上传文件
**URL:** http://127.0.0.1/batchUpload

**Type:** POST


**Content-Type:** multipart/form-data

**Description:** 批量上传文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|文件|true|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/batchUpload
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## 接收表单参数
### 测试formData
**URL:** http://127.0.0.1/formData1

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/formData1  --data 'simpleEnum=RED&username=正豪.龙&password=nmnnfx&nickName=keneth.turcotte&mobile=17068890973&gender=WOMAN'
```

**Response-example:**
```
This api return nothing.
```

### Post请求发表单文件
**URL:** http://127.0.0.1/formData2

**Type:** POST


**Content-Type:** multipart/form-data

**Description:** Post请求发表单文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|true|-
userData|string|No comments found.|true|-
file|file|No comments found.|true|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/formData2  --data 'userId=112&userData=3glt52'
```

**Response-example:**
```
This api return nothing.
```

### Get请求发表单文件 暂不支持完全解析
**URL:** http://127.0.0.1/formData2

**Type:** GET


**Content-Type:** multipart/form-data

**Description:** Get请求发表单文件 暂不支持完全解析

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|true|-
userData|string|No comments found.|true|-
file|file|No comments found.|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/formData2?userId=112&userData=994rlo
```

**Response-example:**
```
This api return nothing.
```

### 表单 包含复杂对象的Get 暂不支持完全解析
**URL:** http://127.0.0.1/formData4

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 包含复杂对象的Get 暂不支持完全解析

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|true|-
userData|string|No comments found.|true|-
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/formData4?userId=112&userData=tg3ku7&simpleEnum=RED&username=正豪.龙&password=dmnxwi&nickName=keneth.turcotte&mobile=17068890973&gender=WOMAN
```

**Response-example:**
```
This api return nothing.
```

### 表单 包含复杂对象
**URL:** http://127.0.0.1/formData5

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 包含复杂对象

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|true|-
userData|string|No comments found.|true|-
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/formData5  --data 'userId=112&userData=shl4fh&simpleEnum=RED&username=正豪.龙&password=xdunp4&nickName=keneth.turcotte&mobile=17068890973&gender=WOMAN'
```

**Response-example:**
```
This api return nothing.
```

### 表单 枚举
**URL:** http://127.0.0.1/formData6

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 枚举

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|true|-
userData|string|No comments found.|true|-
simpleUser|string|No comments found.|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/formData6?userId=112&userData=ykgozh&simpleUser=RED
```

**Response-example:**
```
This api return nothing.
```

### 测试formData带路径参数
**URL:** http://127.0.0.1/formData1/{id}

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路径参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/formData1/{id}  --data 'id=112&simpleEnum=RED&username=正豪.龙&password=xydns1&nickName=keneth.turcotte&mobile=17068890973&gender=WOMAN'
```

**Response-example:**
```
This api return nothing.
```

### 测试formData带路多个路径参数
**URL:** http://127.0.0.1/formData1/{id}/{age}

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路多个路径参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-
age|int32|No comments found.|true|-
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/formData1/{id}/{age}  --data 'id=112&age=44&simpleEnum=RED&username=正豪.龙&password=no0eq4&nickName=keneth.turcotte&mobile=17068890973&gender=WOMAN'
```

**Response-example:**
```
This api return nothing.
```

## https测试
### 测试https
**URL:** http://127.0.0.1/testHttps

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试https

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/testHttps
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
	"data":"fb5630",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 测试http
**URL:** http://127.0.0.1/testHttp

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试http

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/testHttp
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
	"data":"8t2svg",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://127.0.0.1/inner/class

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Return A object contains Inner class

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/inner/class
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|desc|-
innerClass|object|内部类|-
└─phone|string|电话|-

**Response-example:**
```
{
	"name":"value",
	"innerClass":{
		"phone":"14516363332"
	}
}
```

## JDK8的时间测试
### LocalDate和LocalDateTime测试
**URL:** http://127.0.0.1/dateEntity

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** LocalDate和LocalDateTime测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/dateEntity --data '{
	"localDate":"2020-01-19",
	"localDateTime":"2020-01-19 09:34:24"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
localDate|string|创建日期|v1.0
localDateTime|string|创建时间|v1.0

**Response-example:**
```
{
	"localDate":"2020-01-19",
	"localDateTime":"2020-01-19 09:34:24"
}
```

## FastJson和Jackson注解支持测试
### Jackson注解支持测试
**URL:** http://127.0.0.1/json/jacksonTest

**Type:** GET


**Content-Type:** application/json; charset=utf-8

**Description:** Jackson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/json/jacksonTest
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
username|string|用户名|-
idCard|string|身份证号|-

**Response-example:**
```
{
	"username":"正豪.龙",
	"idCard":"450310199212142467"
}
```

### FastJson注解支持测试
**URL:** http://127.0.0.1/json/fastJsonTest

**Type:** GET


**Content-Type:** application/json; charset=utf-8

**Description:** FastJson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|用户名|false|-
idCard|string|身份证号|false|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/json/fastJsonTest
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"value"
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://127.0.0.1/list/listString

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;String&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listString
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|array of string|The api directly returns the array of string type value.|-

**Response-example:**
```
[
	"tadah4",
	"y2bhz9"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://127.0.0.1/list/listMap

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,String&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listMap
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
[
	{
		"mapKey1":"q31yqg",
		"mapKey2":"l88qb5"
	}
]
```

### List&lt;自动义对象&gt;
**URL:** http://127.0.0.1/list/listObject

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;自动义对象&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listObject
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
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":76.44,
		"money":5.49,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	}
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://127.0.0.1/list/listMap2

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,T&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listMap2
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
			"stuName":"正豪.龙",
			"stuAge":true,
			"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":21.25,
				"money":17.47,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":32.87,
					"money":42.65,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":1.00,
					"money":32.01,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":82.27,
				"money":67.63,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		}
	}
]
```

### List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1/list/listMap3

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listMap3
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":28.58,
				"money":10.78,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":24.93,
				"money":24.78,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":11.75,
				"money":47.87,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"age":44
		}
	}
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1/list/listTeacher

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listTeacher
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":22.83,
				"money":96.56,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":30.26,
				"money":14.09,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":12.98,
				"money":5.21,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"age":44
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://127.0.0.1/list/listString1

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listString1
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":2.98,
				"money":76.48,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":65.47,
				"money":10.36,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":23.69,
				"money":66.13,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"age":44
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":89.12,
			"money":15.82,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":30.65,
			"money":79.79,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"age":44
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://127.0.0.1/list/listString2

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listString2
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":47.70,
				"money":34.66,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":68.15,
				"money":81.60,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":99.90,
				"money":12.74,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"age":44
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":31.23,
				"money":18.10,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":17.58,
				"money":77.89,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":58.80,
				"money":71.62,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"age":44
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":68.43,
				"money":64.47,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":55.01,
				"money":55.12,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":71.56,
				"money":60.95,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"age":44
		},
		"age":44
	}
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://127.0.0.1/list/listUserDto

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;List&lt;UserDto&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/list/listUserDto
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
			"token":"vvfitz",
			"LoginList":[
				{
					"userName":"正豪.龙",
					"password":"x2r2r8"
				}
			]
		}
	],
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://127.0.0.1/map/primitive

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Integer&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/primitive
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|key value|The api directly returns the key value type value.|-

**Response-example:**
```
{
	"mapKey1":671,
	"mapKey2":289
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://127.0.0.1/map/objectValue

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Object&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/objectValue
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
**URL:** http://127.0.0.1/map/object

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,User&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/object
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
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":78.34,
		"money":73.49,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	}
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://127.0.0.1/map/test1

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Student&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/test1
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
		"stuName":"正豪.龙",
		"stuAge":true,
		"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"user":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":48.35,
			"money":65.80,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":52.92,
				"money":65.80,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":58.52,
				"money":83.39,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":92.68,
			"money":59.62,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		}
	}
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://127.0.0.1/map/test2

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/test2
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":28.59,
				"money":51.57,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":76.21,
			"money":64.62,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"stuName":"正豪.龙",
			"stuAge":true,
			"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":84.24,
				"money":31.13,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":89.54,
					"money":20.10,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":25.44,
					"money":48.34,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":0.12,
				"money":66.15,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"age":44
	}
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://127.0.0.1/map/test3

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/test3
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":58.54,
				"money":31.31,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":44.58,
			"money":18.91,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"stuName":"正豪.龙",
			"stuAge":true,
			"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"user":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":27.79,
				"money":55.64,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":64.64,
					"money":9.61,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"正豪.龙",
					"nickName":"keneth.turcotte",
					"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
					"userAge":44,
					"phone":"14516363332",
					"createTime":1579397654398,
					"small":36.97,
					"money":15.82,
					"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
					"telephone":"14516363332"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":79.86,
				"money":8.40,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"age":44
	}
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1/map/test4

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/map/test4
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
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":51.64,
				"money":58.24,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":55.73,
				"money":56.19,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":37.70,
				"money":21.38,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"age":44
	}
}
```

## 数组类型pathVariable
### 接收数组类型pathVariable
**URL:** http://127.0.0.1/pathVariable/test/{id}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 接收数组类型pathVariable

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|array|No comments found.|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/pathVariable/test/
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://127.0.0.1/testRequestHeader

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader常规使用

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-
name|string|请求头(name)|true|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestHeader?name=正豪.龙&age=44
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定参数名
**URL:** http://127.0.0.1/testRequestHeader/value

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定参数名

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-
age|int32|  年龄|true|-


**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestHeader/value?name=正豪.龙&age=44
```

**Response-example:**
```
This api return nothing.
```

### 测试RequestHeader绑定默认值
**URL:** http://127.0.0.1/testRequestHeader/DefaultVal

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定默认值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestHeader/DefaultVal?name=正豪.龙&age=44
```

**Response-example:**
```
This api return nothing.
```

## Spring boot params test
### Test Normal param binding
**URL:** http://127.0.0.1/testNormalParams/binding

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Normal param binding

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testNormalParams/binding?name=正豪.龙&age=44
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody User
**URL:** http://127.0.0.1/testRequestBody

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody User

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/testRequestBody --data '{
	"userDetails":[
		{
			"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"正豪.龙",
	"nickName":"keneth.turcotte",
	"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"userAge":44,
	"phone":"14516363332",
	"createTime":1579397654398,
	"small":11.49,
	"money":70.23,
	"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
	"telephone":"14516363332"
}'
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody Map
**URL:** http://127.0.0.1/testRequestBodyMap

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody Map

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/testRequestBodyMap --data '{
	"mapKey":{
		"userDetails":[
			{
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":23.10,
		"money":29.36,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	}
}'
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestBody List
**URL:** http://127.0.0.1/testRequestBodyList

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/testRequestBodyList --data '[
	"pr8ppe",
	"s1rc0e"
]'
```

**Response-example:**
```
This api return nothing.
```

### Test @PathVariable
**URL:** http://127.0.0.1/test/{name}/{no}/info

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @PathVariable

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/test/正豪.龙/8tv31a/info
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam
**URL:** http://127.0.0.1/testRequestParam

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @RequestParam

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|  type|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestParam?author=于耀杰&type=ow719d
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with value
**URL:** http://127.0.0.1/testRequestParamWithValue

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding value is name,but method param name is userName

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestParamWithValue?name=正豪.龙
```

**Response-example:**
```
This api return nothing.
```

### Test @RequestParam with default value
**URL:** http://127.0.0.1/testRequestParamWithDefaultVal

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding default value Jordan

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userName|string|user name|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testRequestParamWithDefaultVal?userName=Jordan
```

**Response-example:**
```
This api return nothing.
```

### Test much path
**URL:** http://127.0.0.1/testMuchPath/get/{userId};	http://127.0.0.1/testMuchPath/find/{userId}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** giteeissues #I1545A

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/testMuchPath/get/544
```

**Response-example:**
```
This api return nothing.
```

### Test much path much parameter
**URL:** http://127.0.0.1/get/{deptId}/{userId};	http://127.0.0.1/find/{deptId}/{userId}

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test much path much parameter

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-
deptId|int64|deptId|true|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/get/256/783
```

**Response-example:**
```
This api return nothing.
```

## Test ResponseEntity
### ResponseEntity return List
**URL:** http://127.0.0.1/responseEntity/list

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** ResponseEntity return List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/responseEntity/list
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
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":74.83,
		"money":13.35,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	}
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://127.0.0.1/simple/str

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回普通String测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/str
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
No field|string|The api directly returns the string type value.|-

**Response-example:**
```
lnen0r
```

### 返回普通javabean
**URL:** http://127.0.0.1/simple/user

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 返回普通javabean

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/simple/user --data '{
	"userDetails":[
		{
			"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"正豪.龙",
	"nickName":"keneth.turcotte",
	"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"userAge":44,
	"phone":"14516363332",
	"createTime":1579397654398,
	"small":84.88,
	"money":68.41,
	"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
	"telephone":"14516363332"
}'
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
			"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"正豪.龙",
	"nickName":"keneth.turcotte",
	"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"userAge":44,
	"phone":"14516363332",
	"createTime":1579397654398,
	"small":17.85,
	"money":91.73,
	"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
	"telephone":"14516363332"
}
```

### 返回复杂实体数据
**URL:** http://127.0.0.1/simple/stu

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回复杂实体数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/stu
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
	"stuName":"正豪.龙",
	"stuAge":true,
	"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"user":{
		"userDetails":[
			{
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":61.78,
		"money":55.10,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	},
	"userMap":{
		"mapKey":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":35.08,
			"money":83.04,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":73.15,
			"money":92.52,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":33.95,
		"money":19.79,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	}
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://127.0.0.1/simple/teacher

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/teacher
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
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":37.99,
			"money":61.61,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":0.34,
			"money":48.78,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":59.42,
			"money":3.35,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"age":44
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":67.34,
			"money":83.55,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":8.83,
			"money":49.22,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":55.90,
			"money":73.87,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"age":44
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":26.07,
			"money":22.59,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":91.74,
			"money":24.55,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":23.77,
			"money":8.00,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"age":44
	},
	"age":44
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://127.0.0.1/simple/teacher2

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;List&lt;User&gt;, User, Student&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/teacher2
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
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":43.81,
			"money":78.88,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		}
	],
	"data1":{
		"userDetails":[
			{
				"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"正豪.龙",
		"nickName":"keneth.turcotte",
		"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"userAge":44,
		"phone":"14516363332",
		"createTime":1579397654398,
		"small":98.65,
		"money":4.10,
		"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
		"telephone":"14516363332"
	},
	"data2":{
		"stuName":"正豪.龙",
		"stuAge":true,
		"stuAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
		"user":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":58.17,
			"money":77.38,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":20.83,
				"money":72.95,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"正豪.龙",
				"nickName":"keneth.turcotte",
				"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
				"userAge":44,
				"phone":"14516363332",
				"createTime":1579397654398,
				"small":93.69,
				"money":26.19,
				"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
				"telephone":"14516363332"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"正豪.龙",
			"nickName":"keneth.turcotte",
			"userAddress":"Suite 914 秦旁76号， 宿迁， 渝 703450",
			"userAge":44,
			"phone":"14516363332",
			"createTime":1579397654398,
			"small":93.31,
			"money":73.52,
			"ipv6":"dd66:c794:d3a2:55f0:49a7:8fb8:1fa7:decf",
			"telephone":"14516363332"
		}
	},
	"age":44
}
```

### 测试SubUser
**URL:** http://127.0.0.1/simple/subUser

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试SubUser

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/subUser
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
subUserName|string|用户名称|-
numbers|number|bigInteger|-

**Response-example:**
```
{
	"subUserName":"正豪.龙",
	"numbers":41
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://127.0.0.1/simple/subUser/result

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CommonResult&lt;SubUser&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/simple/subUser/result
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
		"subUserName":"正豪.龙",
		"numbers":644
	},
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://127.0.0.1/stringCommonResult

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/stringCommonResult
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
	"data":"axx7rn",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://127.0.0.1/staff

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/staff
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|desc|-
annyObject|object|任何信息对象|-
└─name|string|desc|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|desc|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-
data|array|泛型数据|-
└─name|string|desc|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|desc|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-

**Response-example:**
```
{
	"name":"value",
	"annyObject":{
		"name":"value",
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
			"name":"value",
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
**URL:** http://127.0.0.1/staffStr

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
http://127.0.0.1/staffStr
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|desc|-
annyObject|object|任何信息对象|-
data|array|泛型数据|-

**Response-example:**
```
{
	"name":"value",
	"annyObject":"9ag5wd",
	"data":[
		"h0lrmi"
	]
}
```

### JAVA继承测试
**URL:** http://127.0.0.1/children

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** JAVA继承测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/children --data '{
	"name":"value",
	"age":44
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|desc|-
age|int32|年龄|-

**Response-example:**
```
{
	"name":"value",
	"age":44
}
```

## 用户信息操作接口
### 添加用户
**URL:** http://127.0.0.1/user/add

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/user/add --data '{
	"simpleEnum":"RED",
	"username":"正豪.龙",
	"password":"yxoasq",
	"nickName":"keneth.turcotte",
	"mobile":"17068890973",
	"gender":0
}'
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
└─name|string|desc|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|desc|-
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
└─name|string|desc|-
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
	"id":"112",
	"createBy":"1lfzw8",
	"createTime":"2020-01-19",
	"updateBy":"4wxbms",
	"updateTime":"2020-01-19",
	"delFlag":5,
	"username":"正豪.龙",
	"password":"boj13t",
	"nickName":"keneth.turcotte",
	"mobile":"17068890973",
	"email":"越彬.董@yahoo.com",
	"address":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"sex":0,
	"avatar":"gmngx3",
	"type":566,
	"status":667,
	"description":"zrg0dh",
	"roles":[
		{
			"id":"112",
			"createBy":"cjl553",
			"createTime":"2020-01-19",
			"updateBy":"z58bkg",
			"updateTime":"2020-01-19",
			"delFlag":5,
			"name":"value",
			"defaultRole":true,
			"permissions":[
				{
					"id":"112",
					"createBy":"sfxs70",
					"createTime":"2020-01-19",
					"updateBy":"ghono2",
					"updateTime":"2020-01-19",
					"delFlag":5,
					"name":"value",
					"level":502,
					"type":878,
					"title":"lbe43o",
					"path":"xoc2dz",
					"component":"sc1mpi",
					"icon":"oqxpvi",
					"buttonType":"fqvg8m",
					"parentId":"112",
					"description":"wzeqxs",
					"sortOrder":460,
					"status":399,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"lpkfzu"
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
			"id":"112",
			"createBy":"nhej4g",
			"createTime":"2020-01-19",
			"updateBy":"3zfin4",
			"updateTime":"2020-01-19",
			"delFlag":5,
			"name":"value",
			"level":392,
			"type":415,
			"title":"arraq3",
			"path":"woym2f",
			"component":"6s6s8d",
			"icon":"zdle2n",
			"buttonType":"ukhurt",
			"parentId":"112",
			"description":"0hlz2h",
			"sortOrder":875,
			"status":121,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"up8nqi"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}
```

### 更新用户
**URL:** http://127.0.0.1/user/update

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|string|简单枚举|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|int32|性别(See: 性别数据字典)|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/user/update --data '{
	"simpleEnum":"RED",
	"username":"正豪.龙",
	"password":"2xg8bw",
	"nickName":"keneth.turcotte",
	"mobile":"17068890973",
	"gender":0
}'
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
└─name|string|desc|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|desc|-
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
└─name|string|desc|-
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
	"id":"112",
	"createBy":"my4wmu",
	"createTime":"2020-01-19",
	"updateBy":"pyh17q",
	"updateTime":"2020-01-19",
	"delFlag":5,
	"username":"正豪.龙",
	"password":"9ml2c1",
	"nickName":"keneth.turcotte",
	"mobile":"17068890973",
	"email":"越彬.董@yahoo.com",
	"address":"Suite 914 秦旁76号， 宿迁， 渝 703450",
	"sex":0,
	"avatar":"04lwoj",
	"type":813,
	"status":48,
	"description":"f70thj",
	"roles":[
		{
			"id":"112",
			"createBy":"eiq4cm",
			"createTime":"2020-01-19",
			"updateBy":"zd1cna",
			"updateTime":"2020-01-19",
			"delFlag":5,
			"name":"value",
			"defaultRole":true,
			"permissions":[
				{
					"id":"112",
					"createBy":"hyee7a",
					"createTime":"2020-01-19",
					"updateBy":"dpzqha",
					"updateTime":"2020-01-19",
					"delFlag":5,
					"name":"value",
					"level":527,
					"type":790,
					"title":"rim0hm",
					"path":"o4afof",
					"component":"kd257l",
					"icon":"4nv4ha",
					"buttonType":"e2mns0",
					"parentId":"112",
					"description":"4awqts",
					"sortOrder":14,
					"status":758,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"bkekfc"
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
			"id":"112",
			"createBy":"9urir0",
			"createTime":"2020-01-19",
			"updateBy":"3p11z3",
			"updateTime":"2020-01-19",
			"delFlag":5,
			"name":"value",
			"level":975,
			"type":590,
			"title":"228586",
			"path":"8s1btb",
			"component":"xa5g06",
			"icon":"67ndrm",
			"buttonType":"lyb7tr",
			"parentId":"112",
			"description":"hu50ec",
			"sortOrder":706,
			"status":213,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"98i11y"
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
**URL:** http://127.0.0.1/validator/test

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 验证validate

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
birthday|string|生日|false|-
age|int32|年龄|false|-
subject|object|科目|false|-
└─subjectName|string|科目名称|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/validator/test --data '{
	"name":"value",
	"birthday":"2020-01-19",
	"age":44,
	"subject":{
		"subjectName":"正豪.龙"
	}
}'
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### 验证通用参数
**URL:** http://127.0.0.1/validator/valid

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 验证通用参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
token|string|token|false|-
sequenceNo|string|序列号|false|-
parameter|object|No comments found.|false|-
└─subUserName|string|用户名称|false|-
└─numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/validator/valid --data '{
	"token":"g2u6v9",
	"sequenceNo":"aq98v4",
	"parameter":{
		"subUserName":"正豪.龙",
		"numbers":657
	}
}'
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
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## xss拦击测试
### xss过滤普通post请求
**URL:** http://127.0.0.1/xss/text

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤普通post请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|true|-

**Request-example:**
```
curl -X POST -i http://127.0.0.1/xss/text  --data 'text=s17acq'
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
	"data":"tpse7d",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### xss过滤get请求
**URL:** http://127.0.0.1/xss/query

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤get请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|true|-

**Request-example:**
```
curl -X GET -i http://127.0.0.1/xss/query?query=1hdonk
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
	"data":"chcvik",
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

### xss过滤json数据
**URL:** http://127.0.0.1/xss/json

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤json数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
age|int32|年龄|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://127.0.0.1/xss/json --data '{
	"name":"value",
	"age":44
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─name|string|desc|-
└─age|int32|年龄|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"name":"value",
		"age":44
	},
	"code":"15738",
	"timestamp":"2020-01-19 09:34:14"
}
```

## 错误码列表
Error code |Description
---|---
200|desc

## 数据字典
### 订单状态

Code |Type|Description
---|---|---
0|string|已支付
1|string|已支付
2|string|已经失效
