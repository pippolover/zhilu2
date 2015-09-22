(function(){

	function quesionService($http){
	    return {
	    	getTopHot: function(callback) {
	    		var tops = [
	    			{
	    				id: 1, title: 'C++ 用OpenSSL的BIO_xxx访问网页，BIO_read如何设置超时？',
	    				votes: 0, answers: 0, views: 0,
	    				isResovled: false,
	    				progress: {lastOperator: {id: 1, name: '李大白'}, lastTime:'7分钟前提问'},
	    				tags: ['c++', 'openssl']
	    			},
	    			{
	    				id: 2, title: '多人同时开发一个程序该怎么办？',
	    				votes: 3, answers: 7, views: 111,
	    				isResovled: false,
	    				progress: {lastOperator: {id: 1, name: 'Go_Geek '}, lastTime:'9分钟前回答'},
	    				tags: ['php', 'git', 'svn']
	    			},
	    			{
	    				id: 3, title: 'android studio导入后，编译失败',
	    				votes: 3, answers: 5, views: 521,
	    				isResovled: true,
	    				progress: {lastOperator: {id: 1, name: 'Gemini '}, lastTime:'2天前回答'},
	    				tags: ['android-studio', 'android', 'java']
	    			},
	    		];

	    	
	            callback(tops);
	        }
	    	/**
	        getTopHot: function(callback) {
	            $http.get('/api/quesions/tophot').success(function(data) {
	                callback(data.result);
	            });
	        }
	        **/
	    };
	}

	angular
    .module('sofahelp')
    .factory('quesionService', quesionService)

})();

