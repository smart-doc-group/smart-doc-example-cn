下划线
```xml
<w:pBdr>
    <w:bottom w:val="single" w:color="auto" w:sz="4" w:space="0"/>
</w:pBdr>
```

一号标题
```xml
<w:p>
    <w:pPr>
        <w:pStyle w:val="2"/>
        <w:numPr>
            <w:ilvl w:val="0"/>
            <w:numId w:val="0"/>
        </w:numPr>
<!--        <w:pBdr>-->
<!--            <w:bottom w:val="single" w:color="auto" w:sz="4" w:space="0"/>-->
<!--        </w:pBdr>-->
        <w:bidi w:val="0"/>
        <w:ind w:leftChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>测试</w:t>
    </w:r>
</w:p>
```

一号标题带有序列表
```xml
<w:p>
    <w:pPr>
        <w:pStyle w:val="2"/>
        <w:numPr>
            <w:ilvl w:val="0"/>
            <w:numId w:val="2"/>
        </w:numPr>
        <w:bidi w:val="0"/>
        <w:ind w:left="425" w:leftChars="0" w:hanging="425" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>默认分组</w:t>
    </w:r>
</w:p>
```

二号标题带二级列表
```xml
<w:p>
    <w:pPr>
        <w:pStyle w:val="3"/>
        <w:numPr>
            <w:ilvl w:val="1"/>
            <w:numId w:val="2"/>
        </w:numPr>
        <w:bidi w:val="0"/>
        <w:ind w:left="567" w:leftChars="0" w:hanging="567" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>枚举参数测试</w:t>
    </w:r>
</w:p>
```
三号标题带三级列表
```xml
<w:p>
    <w:pPr>
        <w:pStyle w:val="4"/>
        <w:numPr>
            <w:ilvl w:val="2"/>
            <w:numId w:val="2"/>
        </w:numPr>
        <w:bidi w:val="0"/>
        <w:ind w:left="709" w:leftChars="0" w:hanging="709" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>获取枚举参数1</w:t>
    </w:r>
</w:p>
```

三号标题带三级列表, 删除线
```xml
<w:p>
    <w:pPr>
        <w:pStyle w:val="4"/>
        <w:numPr>
            <w:ilvl w:val="2"/>
            <w:numId w:val="2"/>
        </w:numPr>
        <w:bidi w:val="0"/>
        <w:ind w:left="709" w:leftChars="0" w:hanging="709" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:strike/>
            <w:dstrike w:val="0"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:strike/>
            <w:dstrike w:val="0"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>获取枚举参数1</w:t>
    </w:r>
</w:p>
```

无序标题 
```xml
<w:p>
    <w:pPr>
        <w:numPr>
            <w:ilvl w:val="0"/>
            <w:numId w:val="3"/>
        </w:numPr>
        <w:ind w:left="420" w:leftChars="0" w:hanging="420" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:b/>
            <w:bCs/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>Type:</w:t>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t xml:space="preserve"> GET</w:t>
    </w:r>
</w:p>
```

无序标题 值为url
```xml
<w:p>
    <w:pPr>
        <w:numPr>
            <w:ilvl w:val="0"/>
            <w:numId w:val="3"/>
        </w:numPr>
        <w:ind w:left="420" w:leftChars="0" w:hanging="420" w:firstLineChars="0"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:b/>
            <w:bCs/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>URL:</w:t>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:fldChar w:fldCharType="begin"/>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:instrText xml:space="preserve"> HYPERLINK &quot; http:/127.0.0.1:9000/enum&quot; </w:instrText>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:fldChar w:fldCharType="separate"/>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rStyle w:val="15"/>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t xml:space="preserve"> http://127.0.0.1:9000/enum</w:t>
    </w:r>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:fldChar w:fldCharType="end"/>
    </w:r>
</w:p>
```

正文
```xml
<w:p>
    <w:pPr>
        <w:spacing w:line="360" w:lineRule="auto"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:b/>
            <w:bCs/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:b/>
            <w:bCs/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
        <w:t>Request-headers:</w:t>
    </w:r>
</w:p>
```

空行
```xml
<w:p>
    <w:pPr>
        <w:widowControl w:val="0"/>
        <w:numPr>
            <w:ilvl w:val="0"/>
            <w:numId w:val="0"/>
        </w:numPr>
        <w:jc w:val="both"/>
        <w:rPr>
            <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
        </w:rPr>
    </w:pPr>
</w:p>
```

表头 五列两行 表格
```xml
<w:tbl>
    <w:tblPr>
        <w:tblStyle w:val="13"/>
        <w:tblW w:w="0" w:type="auto"/>
        <w:tblInd w:w="0" w:type="dxa"/>
        <w:tblBorders>
            <w:top w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            <w:left w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            <w:bottom w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            <w:right w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            <w:insideH w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            <w:insideV w:val="single" w:color="auto" w:sz="4" w:space="0"/>
        </w:tblBorders>
        <w:tblLayout w:type="autofit"/>
        <w:tblCellMar>
            <w:top w:w="0" w:type="dxa"/>
            <w:left w:w="108" w:type="dxa"/>
            <w:bottom w:w="0" w:type="dxa"/>
            <w:right w:w="108" w:type="dxa"/>
        </w:tblCellMar>
    </w:tblPr>
    <w:tblGrid>
        <w:gridCol w:w="1704"/>
        <w:gridCol w:w="1704"/>
        <w:gridCol w:w="1704"/>
        <w:gridCol w:w="1705"/>
        <w:gridCol w:w="1705"/>
    </w:tblGrid>
    <w:tr>
        <w:tblPrEx>
            <w:tblBorders>
                <w:top w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:left w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:bottom w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:right w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:insideH w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:insideV w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            </w:tblBorders>
            <w:tblCellMar>
                <w:top w:w="0" w:type="dxa"/>
                <w:left w:w="108" w:type="dxa"/>
                <w:bottom w:w="0" w:type="dxa"/>
                <w:right w:w="108" w:type="dxa"/>
            </w:tblCellMar>
        </w:tblPrEx>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="default" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋" w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
                <w:r>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                    <w:t>Parameter</w:t>
                </w:r>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
                <w:vAlign w:val="top"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
                <w:r>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                    <w:t>Value</w:t>
                </w:r>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
                <w:vAlign w:val="top"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
                <w:r>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                    <w:t>Type</w:t>
                </w:r>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1705" w:type="dxa"/>
                <w:vAlign w:val="top"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
                <w:r>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                    <w:t>Required</w:t>
                </w:r>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1705" w:type="dxa"/>
                <w:vAlign w:val="top"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
                <w:r>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                    <w:t>Description</w:t>
                </w:r>
            </w:p>
        </w:tc>
    </w:tr>
    <w:tr>
        <w:tblPrEx>
            <w:tblBorders>
                <w:top w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:left w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:bottom w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:right w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:insideH w:val="single" w:color="auto" w:sz="4" w:space="0"/>
                <w:insideV w:val="single" w:color="auto" w:sz="4" w:space="0"/>
            </w:tblBorders>
            <w:tblCellMar>
                <w:top w:w="0" w:type="dxa"/>
                <w:left w:w="108" w:type="dxa"/>
                <w:bottom w:w="0" w:type="dxa"/>
                <w:right w:w="108" w:type="dxa"/>
            </w:tblCellMar>
        </w:tblPrEx>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1704" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1705" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
            </w:p>
        </w:tc>
        <w:tc>
            <w:tcPr>
                <w:tcW w:w="1705" w:type="dxa"/>
            </w:tcPr>
            <w:p>
                <w:pPr>
                    <w:rPr>
                        <w:rFonts w:hint="eastAsia" w:ascii="仿宋" w:hAnsi="仿宋" w:eastAsia="仿宋"
                                  w:cs="仿宋"/>
                        <w:b/>
                        <w:bCs/>
                        <w:vertAlign w:val="baseline"/>
                        <w:lang w:val="en-US" w:eastAsia="zh-CN"/>
                    </w:rPr>
                </w:pPr>
            </w:p>
        </w:tc>
    </w:tr>
</w:tbl>
```


代码块
```xml
<w:p>
    <w:pPr>
        <w:keepNext w:val="0"/>
        <w:keepLines w:val="0"/>
        <w:widowControl/>
        <w:suppressLineNumbers w:val="0"/>
        <w:shd w:val="clear" w:fill="1E1E1E"/>
        <w:spacing w:line="285" w:lineRule="atLeast"/>
        <w:jc w:val="left"/>
        <w:rPr>
            <w:rFonts w:hint="default" w:ascii="Consolas" w:hAnsi="Consolas" w:eastAsia="Consolas"
                      w:cs="Consolas"/>
            <w:b w:val="0"/>
            <w:bCs w:val="0"/>
            <w:color w:val="D4D4D4"/>
            <w:kern w:val="0"/>
            <w:sz w:val="21"/>
            <w:szCs w:val="21"/>
            <w:shd w:val="clear" w:fill="1E1E1E"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN" w:bidi="ar"/>
        </w:rPr>
    </w:pPr>
    <w:r>
        <w:rPr>
            <w:rFonts w:hint="default" w:ascii="Consolas" w:hAnsi="Consolas" w:eastAsia="Consolas"
                      w:cs="Consolas"/>
            <w:b w:val="0"/>
            <w:bCs w:val="0"/>
            <w:color w:val="D4D4D4"/>
            <w:kern w:val="0"/>
            <w:sz w:val="21"/>
            <w:szCs w:val="21"/>
            <w:shd w:val="clear" w:fill="1E1E1E"/>
            <w:lang w:val="en-US" w:eastAsia="zh-CN" w:bidi="ar"/>
        </w:rPr>
        <w:t>{  </w:t>
    </w:r>
</w:p>
```