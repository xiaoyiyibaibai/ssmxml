(function(){var l=this,aa=function(){},ba=function(a){var b=typeof a;if("object"==b)if(a){if(a instanceof Array)return"array";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if("[object Window]"==c)return"object";if("[object Array]"==c||"number"==typeof a.length&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("splice"))return"array";if("[object Function]"==c||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("call"))return"function"}else return"null";else if("function"==b&&"undefined"==typeof a.call)return"object";return b},m=function(a){return"string"==typeof a},ca=function(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}},p=Date.now||function(){return+new Date},q=function(a,b){var c=a.split("."),d=l;c[0]in d||!d.execScript||d.execScript("var "+c[0]);for(var e;c.length&&(e=c.shift());)c.length||void 0===b?d=d[e]?d[e]:d[e]={}:d[e]=b};var da=function(a,b,c,d,e){if(e)c=a+("&"+b+"="+c);else{var f="&"+b+"=",g=a.indexOf(f);0>g?c=a+f+c:(g+=f.length,f=a.indexOf("&",g),c=0<=f?a.substring(0,g)+c+a.substring(f):a.substring(0,g)+c)}return 2E3<c.length?void 0!==d?da(a,b,d,void 0,e):a:c};var ea=function(){var a=/[&\?#]exk=([^& ]+)/.exec(t.location.href);return a&&2==a.length?a[1]:null};var fa=String.prototype.trim?function(a){return a.trim()}:function(a){return a.replace(/^[\s\xa0]+|[\s\xa0]+$/g,"")},ha=function(a,b){for(var c=0,d=fa(String(a)).split("."),e=fa(String(b)).split("."),f=Math.max(d.length,e.length),g=0;0==c&&g<f;g++){var h=d[g]||"",k=e[g]||"";do{h=/(\d*)(\D*)(.*)/.exec(h)||["","","",""];k=/(\d*)(\D*)(.*)/.exec(k)||["","","",""];if(0==h[0].length&&0==k[0].length)break;c=ga(0==h[1].length?0:parseInt(h[1],10),0==k[1].length?0:parseInt(k[1],10))||ga(0==h[2].length,0==k[2].length)||ga(h[2],k[2]);h=h[3];k=k[3]}while(0==c)}return c},ga=function(a,b){return a<b?-1:a>b?1:0};var ia=function(a,b,c){if("array"==ba(b))for(var d=0;d<b.length;d++)ia(a,String(b[d]),c);else null!=b&&c.push("&",a,""===b?"":"=",encodeURIComponent(String(b)))},ja=function(a,b,c){for(c=c||0;c<b.length;c+=2)ia(b[c],b[c+1],a);return a},ka=function(a,b){var c=2==arguments.length?ja([a],arguments[1],0):ja([a],arguments,1);if(c[1]){var d=c[0],e=d.indexOf("#");0<=e&&(c.push(d.substr(e)),c[0]=d=d.substr(0,e));e=d.indexOf("?");0>e?c[1]="?":e==d.length-1&&(c[1]=void 0)}return c.join("")};var la=function(a){la[" "](a);return a};la[" "]=aa;var na=function(a,b){var c=ma;return Object.prototype.hasOwnProperty.call(c,a)?c[a]:c[a]=b(a)};var oa=function(a,b){for(var c in a)Object.prototype.hasOwnProperty.call(a,c)&&b.call(void 0,a[c],c,a)},ta=function(){var a=pa;if(!a)return"";var b=/.*[&#?]google_debug(=[^&]*)?(&.*)?$/;try{var c=b.exec(decodeURIComponent(a));if(c)return c[1]&&1<c[1].length?c[1].substring(1):"true"}catch(d){}return""};var ua=function(a,b){this.v=a;this.w=b},va=function(a,b){this.url=a;this.m=!!b;this.depth=null};var wa=function(a,b,c,d){a.addEventListener?a.addEventListener(b,c,d||!1):a.attachEvent&&a.attachEvent("on"+b,c)};var xa=function(a,b,c,d,e){this.o=c||4E3;this.g=a||"&";this.H=b||",$";this.h=void 0!==d?d:"trn";this.R=e||null;this.l=!1;this.f={};this.M=0;this.c=[]},ya=function(a,b){var c={};c[a]=b;return[c]},u=function(a,b,c,d){a.c.push(b);a.f[b]=ya(c,d)},Ba=function(a,b,c,d){b=b+"//"+c+d;var e=za(a)-d.length-0;if(0>e)return"";a.c.sort(function(a,b){return a-b});d=null;c="";for(var f=0;f<a.c.length;f++)for(var g=a.c[f],h=a.f[g],k=0;k<h.length;k++){if(!e){d=null==d?g:d;break}var n=Aa(h[k],a.g,a.H);if(n){n=c+n;if(e>=n.length){e-=n.length;b+=n;c=a.g;break}else a.l&&(c=e,n[c-1]==a.g&&--c,b+=n.substr(0,c),c=a.g,e=0);d=null==d?g:d}}f="";a.h&&null!=d&&(f=c+a.h+"="+(a.R||d));return b+f+""},za=function(a){if(!a.h)return a.o;var b=1,c;for(c in a.f)b=c.length>b?c.length:b;return a.o-a.h.length-b-a.g.length-1},Aa=function(a,b,c,d,e){var f=[];oa(a,function(a,h){var g=Ca(a,b,c,d,e);g&&f.push(h+"="+g)});return f.join(b)},Ca=function(a,b,c,d,e){if(null==a)return"";b=b||"&";c=c||",$";"string"==typeof c&&(c=c.split(""));if(a instanceof Array){if(d=d||0,d<c.length){for(var f=[],g=0;g<a.length;g++)f.push(Ca(a[g],b,c,d+1,e));return f.join(c[d])}}else if("object"==typeof a)return e=e||0,2>e?encodeURIComponent(Aa(a,b,c,d,e+1)):"...";return encodeURIComponent(String(a))};var Da=function(a,b,c,d,e){if((d?a.P:Math.random())<(e||a.I))try{var f;c instanceof xa?f=c:(f=new xa,oa(c,function(a,b){var c=f,d=c.M++,e=ya(b,a);c.c.push(d);c.f[d]=e}));var g=Ba(f,a.O,a.J,a.N+b+"&");g&&v(l,g)}catch(h){}},v=function(a,b,c){a.google_image_requests||(a.google_image_requests=[]);var d=a.document.createElement("img");if(c){var e=function(a){c(a);a=e;d.removeEventListener?d.removeEventListener("load",a,!1):d.detachEvent&&d.detachEvent("onload",a);a=e;d.removeEventListener?d.removeEventListener("error",a,!1):d.detachEvent&&d.detachEvent("onerror",a)};wa(d,"load",e);wa(d,"error",e)}d.src=b;a.google_image_requests.push(d)};var Ea=function(a,b,c){this.u=a;this.L=b;this.i=c;this.j=null;this.K=this.s;this.A=!1},Fa=function(a,b,c){this.message=a;this.fileName=b||"";this.lineNumber=c||-1},Ha=function(a,b,c){var d;try{d=c()}catch(g){var e=a.i;try{var f=Ga(g),e=a.K.call(a,b,f,void 0,void 0)}catch(h){a.s("pAR",h)}if(!e)throw g;}finally{}return d},w=function(a,b){var c=Ia;return function(){for(var d=[],e=0;e<arguments.length;++e)d[e]=arguments[e];return Ha(c,a,function(){return b.apply(void 0,d)})}};Ea.prototype.s=function(a,b,c,d,e){try{var f=e||this.L,g=new xa;g.l=!0;u(g,1,"context",a);b instanceof Fa||(b=Ga(b));u(g,2,"msg",b.message.substring(0,512));b.fileName&&u(g,3,"file",b.fileName);0<b.lineNumber&&u(g,4,"line",b.lineNumber.toString());b={};if(this.j)try{this.j(b)}catch(G){}if(d)try{d(b)}catch(G){}d=[b];g.c.push(5);g.f[5]=d;var h;e=l;d=[];var k,n=null;do{b=e;var r;try{var W;if(W=!!b&&null!=b.location.href)b:{try{la(b.foo);W=!0;break b}catch(G){}W=!1}r=W}catch(G){r=!1}r?(k=b.location.href,n=b.document&&b.document.referrer||null):(k=n,n=null);d.push(new va(k||""));try{e=b.parent}catch(G){e=null}}while(e&&b!=e);k=0;for(var H=d.length-1;k<=H;++k)d[k].depth=H-k;b=l;if(b.location&&b.location.ancestorOrigins&&b.location.ancestorOrigins.length==d.length-1)for(k=1;k<d.length;++k){var qa=d[k];qa.url||(qa.url=b.location.ancestorOrigins[k-1]||"",qa.m=!0)}for(var ra=new va(l.location.href,!1),sa=d.length-1,H=sa;0<=H;--H){var I=d[H];if(I.url&&!I.m){ra=I;break}}var I=null,Sb=d.length&&d[sa].url;0!=ra.depth&&Sb&&(I=d[sa]);h=new ua(ra,I);h.w&&u(g,6,"top",h.w.url||"");u(g,7,"url",h.v.url||"");Da(this.u,f,g,this.A,c)}catch(G){try{Da(this.u,f,{context:"ecmserr",rctx:a,msg:Ja(G),url:h.v.url},this.A,c)}catch(wc){}}return this.i};var Ga=function(a){return new Fa(Ja(a),a.fileName,a.lineNumber)},Ja=function(a){var b=a.toString();a.name&&-1==b.indexOf(a.name)&&(b+=": "+a.name);a.message&&-1==b.indexOf(a.message)&&(b+=": "+a.message);if(a.stack){a=a.stack;var c=b;try{-1==a.indexOf(c)&&(a=c+"\n"+a);for(var d;a!=d;)d=a,a=a.replace(/((https?:\/..*\/)[^\/:]*:\d+(?:.|\n)*)\2/,"$1");b=a.replace(/\n */g,"\n")}catch(e){b=c}}return b};var x=document,t=window;var Ka=Array.prototype.indexOf?function(a,b,c){return Array.prototype.indexOf.call(a,b,c)}:function(a,b,c){c=null==c?0:0>c?Math.max(0,a.length+c):c;if(m(a))return m(b)&&1==b.length?a.indexOf(b,c):-1;for(;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},La=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=m(a)?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},Ma=Array.prototype.map?function(a,b,c){return Array.prototype.map.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=Array(d),f=m(a)?a.split(""):a,g=0;g<d;g++)g in f&&(e[g]=b.call(c,f[g],g,a));return e};var Na=function(a,b){for(var c in a)b.call(void 0,a[c],c,a)},Oa=function(a,b){return null!==a&&b in a};var y;a:{var Pa=l.navigator;if(Pa){var Qa=Pa.userAgent;if(Qa){y=Qa;break a}}y=""}var z=function(a){return-1!=y.indexOf(a)},Ra=function(a){for(var b=RegExp("(\\w[\\w ]+)/([^\\s]+)\\s*(?:\\((.*?)\\))?","g"),c=[],d;d=b.exec(a);)c.push([d[1],d[2],d[3]||void 0]);return c};var Sa=function(){return z("Trident")||z("MSIE")},A=function(){return(z("Chrome")||z("CriOS"))&&!z("Edge")},Ua=function(){function a(a){var b;a:{b=d;for(var e=a.length,h=m(a)?a.split(""):a,k=0;k<e;k++)if(k in h&&b.call(void 0,h[k],k,a)){b=k;break a}b=-1}return c[0>b?null:m(a)?a.charAt(b):a[b]]||""}var b=y;if(Sa())return Ta(b);var b=Ra(b),c={};La(b,function(a){c[a[0]]=a[1]});var d=ca(Oa,c);return z("Opera")?a(["Version","Opera"]):z("Edge")?a(["Edge"]):A()?a(["Chrome","CriOS"]):(b=b[2])&&b[1]||""},Ta=function(a){var b=/rv: *([\d\.]*)/.exec(a);if(b&&b[1])return b[1];var b="",c=/MSIE +([\d\.]+)/.exec(a);if(c&&c[1])if(a=/Trident\/(\d.\d)/.exec(a),"7.0"==c[1])if(a&&a[1])switch(a[1]){case "4.0":b="8.0";break;case "5.0":b="9.0";break;case "6.0":b="10.0";break;case "7.0":b="11.0"}else b="7.0";else b=c[1];return b};var Va=function(){return z("iPhone")&&!z("iPod")&&!z("iPad")};var Wa=z("Opera"),B=Sa(),Xa=z("Edge"),C=z("Gecko")&&!(-1!=y.toLowerCase().indexOf("webkit")&&!z("Edge"))&&!(z("Trident")||z("MSIE"))&&!z("Edge"),Ya=-1!=y.toLowerCase().indexOf("webkit")&&!z("Edge"),Za=function(){var a=l.document;return a?a.documentMode:void 0},$a;a:{var ab="",bb=function(){var a=y;if(C)return/rv\:([^\);]+)(\)|;)/.exec(a);if(Xa)return/Edge\/([\d\.]+)/.exec(a);if(B)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(Ya)return/WebKit\/(\S+)/.exec(a);if(Wa)return/(?:Version)[ \/]?(\S+)/.exec(a)}();bb&&(ab=bb?bb[1]:"");if(B){var cb=Za();if(null!=cb&&cb>parseFloat(ab)){$a=String(cb);break a}}$a=ab}var db=$a,ma={},D=function(a){return na(a,function(){return 0<=ha(db,a)})},eb;var fb=l.document;eb=fb&&B?Za()||("CSS1Compat"==fb.compatMode?parseInt(db,10):5):void 0;var E=function(a,b){this.width=a;this.height=b};E.prototype.clone=function(){return new E(this.width,this.height)};E.prototype.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};E.prototype.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};E.prototype.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};E.prototype.scale=function(a,b){this.width*=a;this.height*="number"==typeof b?b:a;return this};!C&&!B||B&&9<=Number(eb)||C&&D("1.9.1");B&&D("9");var F=null,gb=function(){if(!x.body)return!1;if(!F){var a=x.createElement("iframe");a.style.display="none";a.id="anonIframe";F=a;x.body.appendChild(a)}return!0};var Ia;Ia=new Ea(new function(){this.O="http:"===t.location.protocol?"http:":"https:";this.J="pagead2.googlesyndication.com";this.N="/pagead/gen_204?id=";this.I=.01;this.P=Math.random()},"jserror",!0);var J=function(a,b){return w(a,b)};B&&D("9");!Ya||D("528");C&&D("1.9b")||B&&D("8")||Wa&&D("9.5")||Ya&&D("528");C&&!D("8")||B&&D("9");var hb=0,K={},jb=function(a){var b=K.imageLoadingEnabled;if(null!=b)a(b);else{var c=!1;ib(function(b,e){delete K[e];c||(c=!0,null!=K.imageLoadingEnabled||(K.imageLoadingEnabled=b),a(b))})}},ib=function(a){var b=new Image,c,d=""+hb++;K[d]=b;b.onload=function(){clearTimeout(c);a(!0,d)};c=setTimeout(function(){a(!1,d)},300);b.src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="},kb=function(a){if(a){var b=document.createElement("OBJECT");b.data=a;b.width="1";b.height="1";b.style.visibility="hidden";var c=""+hb++;K[c]=b;b.onload=b.onerror=function(){delete K[c]};document.body.appendChild(b)}},lb=function(a){if(a){var b=new Image,c=""+hb++;K[c]=b;b.onload=b.onerror=function(){delete K[c]};b.src=a}},mb=function(a){a&&jb(function(b){b?lb(a):kb(a)})};var nb={G:"ud=1",F:"ts=0",V:"sc=1",C:"gz=1",D:"op=1",W:"efp=1",U:"rda=1",T:"dcl=1",S:"ocy=1",B:"co=1"};if(x&&x.URL){var pa=x.URL,ob=!(pa&&0<ta().length);Ia.i=ob}var L=function(a,b,c,d){wa(a,b,w(d||"osd_or_lidar::"+b,c),void 0)},pb=function(a,b,c){if(!(0>=b)){var d=0,e=function(){a();d++;d<b&&t.setTimeout(w(c,e),100)};e()}};var M=function(a,b){this.b=a||0;this.a=b||""},qb=function(a,b){a.b&&(b[4]=a.b);a.a&&(b[12]=a.a)};M.prototype.match=function(a){return(this.b||this.a)&&(a.b||a.a)?this.a||a.a?this.a==a.a:this.b||a.b?this.b==a.b:!1:!1};M.prototype.toString=function(){var a=""+this.b;this.a&&(a+="-"+this.a);return a};var rb=function(){var a=N,b=[];a.b&&b.push("adk="+a.b);a.a&&b.push("exk="+a.a);return b},sb=function(a){var b=[];Na(a,function(a,d){var c=encodeURIComponent(d),f=a;m(f)&&(f=encodeURIComponent(f));b.push(c+"="+f)});b.push("24="+(new Date).getTime());return b.join("\n")},O=0,tb=0,ub=function(a,b){var c=0,d=t;try{if(d&&d.Goog_AdSense_getAdAdapterInstance)return d}catch(f){}var e=d.location&&d.location.ancestorOrigins;if(!(void 0===e||e&&e.length))return null;for(;d&&5>c;){try{if(d.google_osd_static_frame)return d}catch(f){}try{if(d.aswift_0&&(!a||d.aswift_0.google_osd_static_frame))return d.aswift_0}catch(f){}c++;d=b?0<d.location.ancestorOrigins.length&&d.location.origin==d.location.ancestorOrigins[0]?d.parent:null:d!=d.parent?d.parent:null}return null},vb=function(a,b,c,d,e,f,g){g=g||aa;if(10<tb)t.clearInterval(O),g();else if(++tb,t.postMessage&&(b.b||b.a)){if(f=ub(!0,f)){g={};qb(b,g);g[0]="goog_request_monitoring";g[6]=a;g[16]=c;d&&d.length&&(g[17]=d.join(","));e&&(g[19]=e);try{var h=sb(g);f.postMessage(h,"*")}catch(k){}}}else t.clearInterval(O),g()},wb=function(a){var b=ub(!1),c=!b;!b&&t&&(b=t.parent);if(b&&b.postMessage)try{b.postMessage(a,"*"),c&&t.postMessage(a,"*")}catch(d){}};var P=!1,xb=function(a){if(a=a.match(/[\d]+/g))a.length=3};(function(){if(navigator.plugins&&navigator.plugins.length){var a=navigator.plugins["Shockwave Flash"];if(a&&(P=!0,a.description)){xb(a.description);return}if(navigator.plugins["Shockwave Flash 2.0"]){P=!0;return}}if(navigator.mimeTypes&&navigator.mimeTypes.length&&(a=navigator.mimeTypes["application/x-shockwave-flash"],P=!(!a||!a.enabledPlugin))){xb(a.enabledPlugin.description);return}try{var b=new ActiveXObject("ShockwaveFlash.ShockwaveFlash.7");P=!0;xb(b.GetVariable("$version"));return}catch(c){}try{b=new ActiveXObject("ShockwaveFlash.ShockwaveFlash.6");P=!0;return}catch(c){}try{b=new ActiveXObject("ShockwaveFlash.ShockwaveFlash"),P=!0,xb(b.GetVariable("$version"))}catch(c){}})();var yb=z("Firefox"),zb=Va()||z("iPod"),Ab=z("iPad"),Bb=z("Android")&&!(A()||z("Firefox")||z("Opera")||z("Silk")),Cb=A(),Db=z("Safari")&&!(A()||z("Coast")||z("Opera")||z("Edge")||z("Silk")||z("Android"))&&!(Va()||z("iPad")||z("iPod"));var Q=function(a){return(a=a.exec(y))?a[1]:""};(function(){if(yb)return Q(/Firefox\/([0-9.]+)/);if(B||Xa||Wa)return db;if(Cb)return Q(/Chrome\/([0-9.]+)/);if(Db&&!(Va()||z("iPad")||z("iPod")))return Q(/Version\/([0-9.]+)/);if(zb||Ab){var a=/Version\/(\S+).*Mobile\/(\S+)/.exec(y);if(a)return a[1]+"."+a[2]}else if(Bb)return(a=Q(/Android\s+([0-9.]+)/))?a:Q(/Version\/([0-9.]+)/);return""})();var Fb=function(){var a=t.parent&&t.parent!=t,b=a&&0<="//tpc.googlesyndication.com".indexOf(t.location.host);if(a&&t.name&&0==t.name.indexOf("google_ads_iframe")||b){var c;a=t||t;try{var d;if(a.document&&!a.document.body)d=new E(-1,-1);else{var e=(a||window).document,f="CSS1Compat"==e.compatMode?e.documentElement:e.body;d=(new E(f.clientWidth,f.clientHeight)).round()}c=d}catch(g){c=new E(-12245933,-12245933)}return Eb(c)}c=(t.document||document).getElementsByTagName("SCRIPT");return 0<c.length&&(c=c[c.length-1],c.parentElement&&c.parentElement.id&&0<c.parentElement.id.indexOf("_ad_container"))?Eb(void 0,c.parentElement):null},Eb=function(a,b){var c=Gb("IMG",a,b);return c?c:(c=Gb("IFRAME",a,b))?c:(c=Gb("OBJECT",a,b))?c:null},Gb=function(a,b,c){var d=document;c=c||d;d=a&&"*"!=a?String(a).toUpperCase():"";c=c.querySelectorAll&&c.querySelector&&d?c.querySelectorAll(d+""):c.getElementsByTagName(d||"*");for(d=0;d<c.length;d++){var e=c[d];if("OBJECT"==a)a:{var f=e.getAttribute("height");if(null!=f&&0<f&&0==e.clientHeight)for(var f=e.children,g=0;g<f.length;g++){var h=f[g];if("OBJECT"==h.nodeName||"EMBED"==h.nodeName){e=h;break a}}}f=e.clientHeight;g=e.clientWidth;if(h=b)h=new E(g,f),h=Math.abs(b.width-h.width)<.1*b.width&&Math.abs(b.height-h.height)<.1*b.height;if(h||!b&&10<f&&10<g)return e}return null};var R=0,Hb="",Ib=[],S=!1,T=!1,U=!1,Jb=!0,Kb=!1,Lb=!1,Mb=!1,Nb=!1,Ob=!1,Pb=!1,Qb=0,Rb=0,V=0,Tb=[],N=null,Ub="",Vb=[],Wb=null,Xb=[],Yb=!1,Zb="",$b="",ac=(new Date).getTime(),bc=!1,cc="",dc=!1,ec=["1","0","3"],X=0,Y=0,fc=0,gc="",hc=!1,jc=function(a,b,c){S&&(Jb||3!=(c||3)||Mb)&&ic(a,b,!0);if(U||T&&Lb)ic(a,b),T=U=!1},kc=function(){var a=Wb;return a?2!=a():!0},ic=function(a,b,c){if((b=b||Ub)&&!Yb&&(2==Y||c)&&kc()){for(var d=0;d<Ib.length;++d){var e=lc(Ib[d],b,c),f=a;Kb?mb(e):v(f,e,void 0)}Ob=!0;c?S=!1:Yb=!0}},mc=function(a,b){var c=[];a&&c.push("avi="+a);b&&c.push("cid="+b);return c.length?"//pagead2.googlesyndication.com/activeview?"+c.join("&"):"//pagead2.googlesyndication.com/activeview"},lc=function(a,b,c){c=c?"osdim":U?"osd2":"osdtos";a=[a,-1<a.indexOf("?")?"&id=":"?id=",c];"osd2"==c&&T&&Lb&&a.push("&ts=1");a.push("&ti=1");a.push("&",b);a.push("&uc="+fc);bc?a.push("&tgt="+cc):a.push("&tgt=nf");a.push("&cl="+(dc?1:0));Pb&&(a.push("&lop=1"),b=p()-Qb,a.push("&tslp="+b));b=a.join("");for(a=0;a<Vb.length;a++){try{var d=Vb[a]()}catch(e){}c="max_length";2<=d.length&&(3==d.length&&(c=d[2]),b=da(b,encodeURIComponent(d[0]),encodeURIComponent(d[1]),c))}2E3<b.length&&(b=b.substring(0,2E3));return b},Z=function(a){if(Zb){try{var b=da(Zb,"vi",a);gb()&&v(F.contentWindow,b,void 0)}catch(c){}0<=Ka(ec,a)&&(Zb="")}},nc=function(){Z("-1")},pc=function(a){if(a&&a.data&&m(a.data)){var b;var c=a.data;if(m(c)){b={};for(var c=c.split("\n"),d=0;d<c.length;d++){var e=c[d].indexOf("=");if(!(0>=e)){var f=Number(c[d].substr(0,e)),e=c[d].substr(e+1);switch(f){case 5:case 8:case 11:case 15:case 16:case 18:e="true"==e;break;case 4:case 7:case 6:case 14:case 20:case 21:case 22:case 23:case 24:case 25:e=Number(e);break;case 3:case 19:if("function"==ba(decodeURIComponent))try{e=decodeURIComponent(e)}catch(h){throw Error("Error: URI malformed: "+e);}break;case 17:e=Ma(decodeURIComponent(e).split(","),Number)}b[f]=e}}b=b[0]?b:null}else b=null;if(b&&(c=new M(b[4],b[12]),N&&N.match(c))){for(c=0;c<Xb.length;c++)Xb[c](b);b&&(c=100*b[25],"number"==typeof c&&!isNaN(c)&&(window.document["4CGeArbVQ"]=c|0));void 0!=b[18]&&(Mb=b[18],Mb||2!=V||(V=3,oc()));c=b[0];if("goog_acknowledge_monitoring"==c)t.clearInterval(O),X=2;else if("goog_get_mode"==c){X=1;d={};N&&qb(N,d);d[0]="goog_provide_mode";d[6]=Y;d[19]=gc;d[16]=T;try{var g=sb(d);a.source.postMessage(g,a.origin)}catch(h){}t.clearInterval(O);X=2}else"goog_update_data"==c?(Ub=b[3],++fc):"goog_image_request"==c&&(jc(t,b[3]),b[5]||b[11]||Z("0"));if("goog_update_data"==c||"goog_image_request"==c)(1==Y||2==Y||S)&&b[5]&&(a=1==b[15]&&"goog_update_data"==c,Lb=!0,Z("1"),$b&&kc()&&(g=$b,gb()&&v(F.contentWindow,g,void 0),$b=""),S&&!a&&(ic(t,void 0,!0),Nb=!0,Rb=p()),3==V&&(V=4,oc()),S||1!=Y||(Yb=!0)),(1==Y||2==Y||S)&&b[11]&&(T=!1,Z("3"),S&&(ic(t,void 0,!0),1==V&&Mb&&(V=2)))}}},oc=function(){var a=t,b=V;0!=b&&1!=b&&qc(a,"osdim","zas="+b)},qc=function(a,b,c){var d=[];Hb&&d.push("avi="+Hb);d.push("id="+b);d.push("ovr_value="+R);Pb&&d.push("lop=1");N&&(d=d.concat(rb()));d.push("tt="+((new Date).getTime()-ac));d.push(c);a.document&&a.document.referrer&&d.push("ref="+encodeURIComponent(a.document.referrer));try{v(a,"//pagead2.googlesyndication.com/pagead/gen_204?"+d.join("&"),void 0)}catch(e){}},rc=function(){jc(t);Z("0");2>X&&!T&&2==Y&&qc(t,"osd2","hs="+X)},sc=function(){var a={};qb(N,a);a[0]="goog_dom_content_loaded";var b=sb(a);try{pb(function(){wb(b)},10,"osd_listener::ldcl_int")}catch(c){}},tc=function(){var a={};qb(N,a);a[0]="goog_creative_loaded";var b=sb(a);pb(function(){wb(b)},10,"osd_listener::lcel_int");dc=!0},uc=function(a){if(m(a)){a=a.split("&");for(var b=a.length-1;0<=b;b--){var c=a[b],d=nb;c==d.G?(Jb=!1,a.splice(b,1)):c==d.C?(V=1,a.splice(b,1)):c==d.F?(T=!1,a.splice(b,1)):c==d.D?(Kb=!0,a.splice(b,1)):c==d.B&&(hc=!0,a.splice(b,1))}gc=a.join("&")}},vc=function(){if(!bc){var a=Fb();a&&(bc=!0,cc=a.tagName,a.complete||a.naturalWidth?tc():L(a,"load",tc,"osd_listener::creative_load"))}};q("osdlfm",J("osd_listener::init",function(a,b,c,d,e,f,g,h,k,n){R=a;Zb=b;$b=d;S=f;g&&uc(g);T=f;1==h?Tb.push(947190538):2==h?Tb.push(947190541):3==h&&Tb.push(947190542);N=new M(e,ea());L(t,"load",nc,"osd_listener::load");L(t,"message",pc,"osd_listener::message");Hb=c||"";Ib=[n||mc(c,k)];L(t,"unload",rc,"osd_listener::unload");var r=t.document;!r.readyState||"complete"!=r.readyState&&"loaded"!=r.readyState?!Sa()||0<=ha(Ua(),11)?L(r,"DOMContentLoaded",sc,"osd_listener::dcl"):L(r,"readystatechange",function(){"complete"!=r.readyState&&"loaded"!=r.readyState||sc()},"osd_listener::rsc"):sc();-1==R?Y=f?3:1:-2==R?Y=3:0<R&&(Y=2,U=!0);T&&!U&&-1==R&&(Y=2);N&&(N.b||N.a)&&(X=1,O=t.setInterval(w("osd_proto::reqm_int",ca(vb,Y,N,T,Tb,gc,hc,void 0)),500));pb(vc,5,"osd_listener:sfc")}));q("osdlac",J("osd_listener::lac_ex",function(a){Vb.push(a)}));q("osdlamrc",J("osd_listener::lamrc_ex",function(a){Xb.push(a)}));q("osdsir",w("osd_listener::sir_ex",jc));q("osdacrc",J("osd_listener::acrc_ex",function(a){Wb=a}));q("osdpcls",J("osd_listener::acrc_ex",function(a){if(!a||t==t.top||Yb||Ob&&!Nb)return!1;Pb=!0;a=/^(http[s]?:)?\/\//.test(a)?a:mc(a);if(Nb){var b=lc(a,Ub,!0),c=p()-Rb,b=ka(b,"tsvp",c),c=t;Kb?mb(b):v(c,b,void 0)}Ib.push(a);Qb=p();return!0}));}).call(this);
