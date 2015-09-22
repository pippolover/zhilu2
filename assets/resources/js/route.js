(function(){

	function config($stateProvider, $urlRouterProvider) {
	    $urlRouterProvider.otherwise("/questions/tophot");
	    $stateProvider
	
	        .state('questions', {
	            abstract: true,
	            url: "/questions",
	            templateUrl: "common/content.html",
	        })
	        .state('questions.tophot', {
	            url: "/tophot",
	            templateUrl: "questions/tophot.html",
	        })
	        .state('questions.hot', {
	            url: "/hot",
	            templateUrl: "questions/hot.html",
	        })
	        .state('questions.notanswered', {
	            url: "/notanswered",
	            templateUrl: "questions/notanswered.html",
	        })
	}
	
	
	angular
	.module('sofahelp')
	.config(config)
	.run(function($rootScope, $state) {
		$rootScope.$state = $state;
	});
})();
