exception E2 and E3 ;;
(*
Exception E2 defined.
Exception E3 defined.
*)

for i = 1 to raise E2
do
  raise E3
done ;;
(* Uncaught exception: E2 *)
