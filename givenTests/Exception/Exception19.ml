exception E1 and E2 ;;
(* Exception E1 defined.
   Exception E2 defined. *)

if false then raise E1 else raise E2 ;;
(* Uncaught exception: E2 *)
