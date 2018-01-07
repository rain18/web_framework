## 《javaweb 架构设计》 代码实现与改进

### 实现功能
  1. 读取配置文件  
  2. 实现IOC  
  3. 实现请求转发  

### 需要改进的地方
  1. 读取配置文件等地方用的stream，效率低下  
  2. 实现依赖注入时，对map进行遍历，效率低   
  3. 加载controller时，遍历效率低，存储在map中，感觉对内存要求较大  
