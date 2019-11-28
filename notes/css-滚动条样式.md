```scss
&::-webkit-scrollbar {
		width: 6px !important;
		height: 6px !important;
		margin: 0 !important;
		border-radius: .2rem!important;
		background: #E7EBF5!important;
		*:hover {
			cursor: pointer !important;
		}
 }

&::-webkit-scrollbar-track, textarea::-webkit-scrollbar-track { // 滑块槽
	border-radius: 3px !important;
	background: rgba(223,228,239,1) !important;
	-webkit-box-shadow: none !important;

&::-webkit-scrollbar-thumb, textarea::-webkit-scrollbar-thumb { // 滑块
	border-radius: 3px !important;
	background: rgba(97,139,241,0.8) !important;
	-webkit-box-shadow: none !important;
	&:hover {
		background: rgba(97,139,241,1) !important;
	}
}
```
