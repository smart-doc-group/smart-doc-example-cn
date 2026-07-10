package com.power.doc.controller.html;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.*;

/**
 * <b>HTML Javadoc</b> test controller.
 * <p>
 * Demonstrates that smart-doc supports <a href="https://www.oracle.com/java/">HTML syntax</a>
 * in Javadoc comments. Tags like <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>,
 * <code>&lt;b&gt;</code>, <code>&lt;i&gt;</code> should render as HTML.
 * </p>
 *
 * <ul>
 *   <li>Feature 1: <b>Bold text</b> via &lt;b&gt; tag</li>
 *   <li>Feature 2: <i>Italic text</i> via &lt;i&gt; tag</li>
 *   <li>Feature 3: <a href="https://github.com">Hyperlinks</a> via &lt;a&gt; tag</li>
 *   <li>Feature 4: <code>Inline code</code> via &lt;code&gt; tag</li>
 * </ul>
 *
 * @author shalousun 2026/07/11
 */
@RestController
@RequestMapping("htmlJavadoc")
public class HtmlJavadocController {

    /**
     * Uncapitalizes a String <a href="https://link">link</a>.
     * <p>
     * This method demonstrates that arbitrary <b>HTML</b> in Javadoc comments
     * is <i>preserved</i> and rendered correctly in the generated documentation.
     * </p>
     *
     * <ul>
     *   <li>Step 1: Receive the input string</li>
     *   <li>Step 2: <code>uncapitalize</code> the first character</li>
     *   <li>Step 3: Return the <b>modified</b> string</li>
     * </ul>
     *
     * @param name the input string, e.g. <code>"HelloWorld"</code>
     * @return the uncapitalized string, e.g. <code>"helloWorld"</code>
     * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
     */
    @PostMapping(value = "/uncapitalize")
    public CommonResult<String> uncapitalize(@RequestBody String name) {
        if (name == null || name.isEmpty()) {
            return CommonResult.ok(name);
        }
        return CommonResult.ok(Character.toLowerCase(name.charAt(0)) + name.substring(1));
    }

    /**
     * Retrieves a user with <b>detailed</b> <i>information</i>.
     * <p>
     * For more details, visit <a href="https://example.com/docs">our documentation</a>.
     * </p>
     *
     * @param id the user <code>id</code>
     * @return the user entity
     */
    @GetMapping(value = "/user/{id}")
    public CommonResult<SimpleUser> getUser(@PathVariable String id) {
        SimpleUser user = new SimpleUser();
        user.setUsername("test");
        return CommonResult.ok(user);
    }

    /**
     * Lists all <b>available</b> items with <i>optional</i> filtering.
     *
     * <table border="1">
     *   <tr><th>Param</th><th>Type</th><th>Description</th></tr>
     *   <tr><td><code>type</code></td><td>String</td><td>Item type filter</td></tr>
     *   <tr><td><code>status</code></td><td>Integer</td><td>Status filter</td></tr>
     * </table>
     *
     * @param type  the item type, e.g. <code>"book"</code>
     * @param status the item status
     * @return a list of matching items
     */
    @GetMapping(value = "/items")
    public CommonResult<String> listItems(@RequestParam String type, @RequestParam Integer status) {
        return CommonResult.ok("items: " + type + ", status: " + status);
    }
}
