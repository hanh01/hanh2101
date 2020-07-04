<!DOCTYPE html>
<html>
<head>
    <title>Be right back</title>
    <style>
        html, body{
            height:100%;
        }

        body{
            margin: 0;
            padding: 0;
            width: 100%;
            color: #B0BEC5;
            display: table;
            font-weight: 100;
            font-family: 'Lato',sans-serif;
        }

        .container{
            text-align: center;
            display: table-cell;
            vertical-align: middle;
        }

        .content {
            text-align: center;
            display: inline-block;
        }

        .title {
            font-size:72px;
            margin-bottom: 40px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="content">
            <div class="title">Be right back.</div>
            <?php if(count($errors)>0): ?>
                <div class="alert alert-danger">
                    <strong>Có lỗi rồi nè</strong>
                    <br><br>
                    <ul>
                        <?php $__currentLoopData = $errors->all(); $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $errors): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
                            <li><?php echo e($errors); ?></li>
                            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
                    </ul>
                </div>
                <?php endif; ?>;
        </div>
    </div>
</body>
</html>

<?php /**PATH C:\Xampp1\htdocs\hanh\resources\views/errors/503.blade.php ENDPATH**/ ?>