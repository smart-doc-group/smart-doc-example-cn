
# 循环引用依赖测试
## 循环依赖参数推导
**URL:** `http://localhost:8080/circularReference`

**Type:** `GET`

**Author:** yu 2019/10/24.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 循环依赖参数推导(不建议使用)




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
a|string|属性a|false|-
b|object|对象b|false|-
└─b|string|属性b|false|-
└─c|object|对象c|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─c|string|属性c|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|object|对象A|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|string|属性a|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─b|object|对象b|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/circularReference --data '{
  "a": "zkco2m",
  "b": {
    "b": "zbcp8h",
    "c": {
      "c": "fimm9u",
      "a": {
        "a": "m5ui2n",
        "b": {
          "$ref": "..."
        }
      }
    }
  }
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
a|string|属性a|-
b|object|对象b|-
└─b|string|属性b|-
└─c|object|对象c|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─c|string|属性c|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|object|对象A|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|string|属性a|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─b|object|对象b|-

**Response-example:**
```
{
  "a": "wna7ft",
  "b": {
    "b": "btzi8b",
    "c": {
      "c": "xeh2mu",
      "a": {
        "a": "axfa05",
        "b": {
          "$ref": "..."
        }
      }
    }
  }
}
```

