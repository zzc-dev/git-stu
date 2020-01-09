### flex容器样式
1. flex-direction 主轴方向；决定项目的排列方向
2. flex-wrap 如果一条轴线排不下，如何换行
3. flex-flow flex-flow: <flex-direction> <flex-wrap>
4. justify-content 项目（item）在主轴上的对齐方式
5. align-items 项目在交叉轴的对齐方式
6. align-content  多根轴线的对齐方式
### 项目的属性
1. order 项目的排列顺序，数值越小，排列越靠前
2. flex-grow
    1. flex-grow和width同时作用在一个项目上，flex-grow <item.width< flex-grow+width,具体的计算方式不知道
    2. 如果项目中有一个设置了该属性，其他的没有设置，则改项目的宽度定义无效，占据所有的剩余空间
    3. 有多个项目设置了该属性，先让没有设置的项目占据他们的空间，然后再平分剩余空间
    4. 如果所有项目的flex-grow属性都为1，则它们将等分剩余空间（如果有的话）。如果一个项目的flex-grow属性为2，其他项目都为1，则前者占据的剩余空间将比其他项多一倍。
3. flex-shrink
    1. 如果空间不足时，改项目将缩小
    2. 如果所有项目的flex-shrink属性都为1，当空间不足时，都将等比例缩小。如果一个项目的flex-shrink属性为0，其他项目都为1，则空间不足时，前者不缩小。
4. flex-basis
    1. flex-basis属性定义了在分配多余空间之前，项目占据的主轴空间（main size）。浏览器根据这个属性，计算主轴是否有多余空间。它的默认值为auto，即项目的本来大小。
    2. 它可以设为跟width或height属性一样的值（比如350px），则项目将占据固定空间。
5. flex
    1.  flex: none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]
    2. flex:1; 此时宽度设置无效
6. align-self: 允许单个项目与其他项目有不一样的对其方式

参考：【https://www.runoob.com/w3cnote/flex-grammar.html】
