# refactoring-improving-the-design-of-existing-code


----------


# 目录 #
## 第1章 重构，第一个案例 1 ##
1.1 起点 1 
1.2 重构的第一步 7
1.3 分解并重组statement() 8
1.4 运用多态取代与价格相关的条件逻辑 34 
1.5 结语 52 
## 第2章 重构原则 53 ##
2.1 何谓重构 53
2.2 为何重构 55
2.3 何时重构 57
2.4 怎么对经理说 60
2.5 重构的难题 62
2.6 重构与设计 66
2.7 重构与性能 69
2.8 重构起源何处 71
## 第3章 代码的坏味道 75 ##
3.1 Duplicated Code（重复代码） 76
3.2 Long Method（过长函数） 76
3.3 Large Class（过大的类） 78
3.4 Long Parameter List（过长参数列） 78
3.5 Divergent Change（发散式变化） 79
3.6 Shotgun Surgery（霰弹式修改） 80
3.7 Feature Envy（依恋情结） 80
3.8 Data Clumps（数据泥团） 81
3.9 Primitive Obsession（基本类型偏执） 81
3.10 Switch Statements（switch惊悚现身） 82
3.11 Parallel InheritanceHierarchies（平行继承体系） 83
3.12 Lazy Class（冗赘类） 83
3.13 Speculative Generality（夸夸其谈未来性） 83
3.14 Temporary Field（令人迷惑的暂时字段） 84
3.15 Message Chains（过度耦合的消息链） 84
3.16 Middle Man（中间人） 85
3.17 Inappropriate Intimacy（狎昵关系） 85
3.18 Alternative Classes with Different Interfaces（异曲同工的类） 85
3.19 Incomplete Library Class（不完美的库类） 86
3.20 Data Class（纯稚的数据类） 86
3.21 Refused Bequest（被拒绝的遗赠） 87
3.22 Comments（过多的注释） 87
## 第4章 构筑测试体系 89 ##
4.1 自测试代码的价值 89
4.2 JUnit测试框架 91
4.3 添加更多测试 97
## 第5章 重构列表 103 ##
5.1 重构的记录格式 103
5.2 寻找引用点 105
5.3 这些重构手法有多成熟 106
## 第6章 重新组织函数 109 ##
6.1 Extract Method（提炼函数） 110
6.2 Inline Method（内联函数） 117
6.3 Inline Temp（内联临时变量） 119
6.4 Replace Temp with Query（以查询取代临时变量） 120
6.5 Introduce Explaining Variable（引入解释性变量） 124
6.6 Split Temporary Variable（分解临时变量） 128
6.7 Remove Assignments to Parameters（移除对参数的赋值） 131
6.8 Replace Method with Method Object（以函数对象取代函数） 135
6.9 Substitute Algorithm（替换算法） 139
## 第7章 在对象之间搬移特性 141 ##
7.1 Move Method（搬移函数） 142
7.2 Move Field（搬移字段） 146
7.3 Extract Class（提炼类） 149
7.4 Inline Class（将类内联化） 154
7.5 Hide Delegate（隐藏“委托关系”） 157
7.6 Remove Middle Man（移除中间人） 160
7.7 Introduce Foreign Method（引入外加函数） 162
7.8 Introduce Local Extension（引入本地扩展） 164
## 第8章 重新组织数据 169 ##
8.1 Self Encapsulate Field（自封装字段） 171
8.2 Replace Data Value with Object（以对象取代数据值） 175
8.3 Change Value to Reference（将值对象改为引用对象） 179
8.4 Change Reference to Value（将引用对象改为值对象） 183
8.5 Replace Array with Object（以对象取代数组） 186
8.6 Duplicate Observed Data（复制“被监视数据”） 189
8.7 Change Unidirectional Association to Bidirectional（将单向关联改为双向关联） 197
8.8 Change Bidirectional Association to Unidirectional（将双向关联改为单向关联） 200
8.9 Replace Magic Number with Symbolic Constant（以字面常量取代魔法数） 204
8.10 Encapsulate Field（封装字段） 206
8.11 Encapsulate Collection（封装集合） 208
8.12 Replace Record with Data Class（以数据类取代记录） 217
8.13 Replace Type Code with Class（以类取代类型码） 218
8.14 Replace Type Code with Subclasses（以子类取代类型码） 223
8.15 Replace Type Code with State/Strategy（以State/Strategy取代类型码） 227
8.16 Replace Subclass with Fields（以字段取代子类） 232
## 第9章 简化条件表达式 237 ##
9.1 Decompose Conditional（分解条件表达式） 238
9.2 Consolidate Conditional Expression（合并条件表达式） 240
9.3 Consolidate Duplicate Conditional Fragments（合并重复的条件片段） 243
9.4 Remove Control Flag（移除控制标记） 245
9.5 Replace Nested Conditional with Guard Clauses（以卫语句取代嵌套条件表达式） 250
9.6 Replace Conditional with Polymorphism（以多态取代条件表达式） 255
9.7 Introduce Null Object（引入Null对象） 260
9.8 Introduce Assertion（引入断言） 267
## 第10章 简化函数调用 271 ##
10.1 Rename Method（函数改名） 273
10.2 Add Parameter（添加参数） 275
10.3 Remove Parameter（移除参数） 277
10.4 Separate Query from Modifier（将查询函数和修改函数分离） 279
10.5 Parameterize Method（令函数携带参数） 283
10.6 Replace Parameter with Explicit Methods（以明确函数取代参数） 285
10.7 Preserve Whole Object（保持对象完整） 288
10.8 Replace Parameter with Methods（以函数取代参数） 292
10.9 Introduce Parameter Object（引入参数对象） 295
10.10 Remove Setting Method（移除设值函数） 300
10.11 Hide Method（隐藏函数） 303
10.12 Replace Constructor with Factory Method（以工厂函数取代构造函数） 304
10.13 Encapsulate Downcast（封装向下转型） 308
10.14 Replace Error Code with Exception（以异常取代错误码） 310
10.15 Replace Exception with Test（以测试取代异常） 315
## 第11章 处理概括关系 319 ##
11.1 Pull Up Field（字段上移） 320
11.2 Pull Up Method（函数上移） 322
11.3 Pull Up Constructor Body（构造函数本体上移） 325
11.4 Push Down Method（函数下移） 328
11.5 Push Down Field（字段下移） 329
11.6 Extract Subclass（提炼子类） 330
11.7 Extract Superclass（提炼超类） 336
11.8 Extract Interface（提炼接口） 341
11.9 Collapse Hierarchy（折叠继承体系） 344
11.10 Form Tem Plate Method（塑造模板函数） 345
11.11 Replace Inheritance with Delegation（以委托取代继承） 352
11.12 Replace Delegation with Inheritance（以继承取代委托） 355
## 第12章 大型重构 359 ##
12.1 Tease Apart Inheritance（梳理并分解继承体系） 362
12.2 Convert Procedural Design to Objects（将过程化设计转化为对象设计） 368
12.3 Separate Domain from Presentation（将领域和表述/显示分离） 370
12.4 Extract Hierarchy（提炼继承体系） 375
## 第13章 重构，复用与现实 379 ##
13.1 现实的检验 380
13.2 为什么开发者不愿意重构他们的程序 381
13.3 再论现实的检验 394
13.4 重构的资源和参考资料 394
13.5 从重构联想到软件复用和技术传播 395
13.6 小结 397
13.7 参考文献 397
## 第14章 重构工具 401 ##
14.1 使用工具进行重构 401
14.2 重构工具的技术标准 403
14.3 重构工具的实用标准 405
14.4 小结 407
## 第15章 总结 409 ##
参考书目 413
要点列表 417
索引 419