# 毗邻
嵌套或者同级

# 问题
body距离html总有空白，并且body的margin和padding都为0

# 原因
1. 在body中使用了`<h1/>`，h1自带margin:0.67em
2. 子元素设置margin-top，他会找到毗邻的元素（border和padding都为0），并且把margin-top共享给它，

# 解决
1. 在父级写上border或者padding
2. 父元素或者子元素使用浮动或者绝对定位
2. 父元素加上 overflow:hidden
