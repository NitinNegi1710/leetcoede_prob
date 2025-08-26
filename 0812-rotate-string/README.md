<h2><a href="https://leetcode.com/problems/rotate-string">812. Rotate String</a></h2><h3>Easy</h3><hr><p>Given two strings <code>s</code> and <code>goal</code>, return <code>true</code> <em>if and only if</em> <code>s</code> <em>can become</em> <code>goal</code> <em>after some number of <strong>shifts</strong> on</em> <code>s</code>.</p>

<p>A <strong>shift</strong> on <code>s</code> consists of moving the leftmost character of <code>s</code> to the rightmost position.</p>

<ul>
	<li>For example, if <code>s = &quot;abcde&quot;</code>, then it will be <code>&quot;bcdea&quot;</code> after one shift.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "abcde", goal = "cdeab"
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "abcde", goal = "abced"
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, goal.length &lt;= 100</code></li>
	<li><code>s</code> and <code>goal</code> consist of lowercase English letters.</li>
</ul>


class Solution {
    public boolean rotateString(String s, String goal) {
        // char c =s.charAt(0);
        int m = s.length();
        if(s.length()!=goal.length())return false;
        char[] chars = goal.toCharArray();
        // int mod;
        for(int mod =0;mod<m;mod++){
            if(s.charAt(0)==chars[mod]){
                boolean match = true;
                for(int i =0;i<m;i++){
                    if(s.charAt(i)!=goal.charAt((i+mod)%m)){
                        match=false;
                        break;
                    }
                }
                if(match)return true;
            }
        }
        // int mod = goal.indexOf(c);
        
        // if(s.length()!=goal.length())return false;
        // for(int i =0;i<s.length();i++){
            
        return false;
                                                                            
    }
}
