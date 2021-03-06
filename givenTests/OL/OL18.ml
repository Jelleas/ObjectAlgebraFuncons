type 'a idref = { mutable id: 'a -> 'a };;
(* Type idref defined. *)

let r1 = {mutable id = function x -> x};;
(* r1 : '_a idref = {id = <fun>} *)

let g s x = (s.id) x;;
(* g : 'a idref -> 'a -> 'a = <fun> *)

g r1 1;;
(* - : int = 1 *)

let r2 = {mutable id = function x -> x};;
(* r2 : '_a idref = {id = <fun>} *)

g r2 true;;
(* - : bool = true *)

r2.id <- (function x -> (print_string "called id\n"; x));;
(* - : unit = () *)

g r2 false;;
(* called id
   - : bool = false
*)