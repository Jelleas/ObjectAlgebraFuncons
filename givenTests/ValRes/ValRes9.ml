let (f : 'a -> 'a) = function x -> x ;;
(* f : 'a -> 'a = <fun> *)

let (g : 'b -> 'b) = function y -> y ;;
(* g : 'a -> 'a = <fun> *)

f 7 ;;
(* - : int = 7 *)

g true ;;
(* - : bool = true *)

let h = if true then f else g ;;
(* h : 'a -> 'a = <fun> *)


(*

let id = function u -> u ;;

let (x : 'a -> 'a) = id (function u -> u) ;;

let (y : 'b -> 'b) = id (function u -> u) ;;

let (z : 'a -> 'a) = id (function u -> u) ;;

x 7 ;;

z true ;;

if true then x else z ;;

*)
