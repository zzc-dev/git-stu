# onresize
``` vue
mounted () {
        	let timeout = null;
        	window.onresize = () => {
				this.count++;
				let scope = this;
				if(timeout) clearTimeout(timeout);
				timeout = setTimeout(function () {
					scope.dealCount++;
				}, 1000);
			};
		}
```
在mounted中去注册resize的绑定事件，resize事件会触发多次，为了防止其多次触发导致页面多次加载，使用`setTimeout`延时函数，在下一次resize事件触发时，
清除上次的事件`clearTimeout`,直到最后一次resize事件触发，执行`第10行 scope.dealCount++`。
