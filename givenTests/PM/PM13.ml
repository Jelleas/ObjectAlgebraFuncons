let f = fun | 0 -> `A`
            | 1 -> `B` ;;
(* f : int -> char = <fun> *)
 
f 0 ;;
(* - : char = `A` *)

f 1 ;;
(* - : char = `B` *)

f 2 ;;
(* Uncaught exception: Match_failure *)
